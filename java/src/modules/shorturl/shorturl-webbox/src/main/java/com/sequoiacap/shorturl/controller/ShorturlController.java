package com.sequoiacap.shorturl.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sequoiacap.data.Response;
import com.sequoiacap.shorturl.data.SUrlData;
import com.sequoiacap.shorturl.model.SUrl;
import com.sequoiacap.shorturl.service.SUrlManager;

import com.sequoiacap.errorcode.ErrorCode;
import com.sequoiacap.errorcode.ErrorCodeStr;
import com.sequoiacap.exception.BusinessException;

import jodd.util.StringUtil;
import net.jhorstmann.i18n.I18N;

@Controller
@RequestMapping("/s")
public class ShorturlController
{
	@Resource(name = "redisTemplate")
	private ValueOperations<String, String> valOps;
	
	@Autowired
	private SUrlManager sUrlManager;

	@ResponseBody
	@RequestMapping("/set")
	public Response<SUrlData> set(String url, String type, HttpServletRequest _request)
	{
		Response<SUrlData> response = new Response<SUrlData>();
		
		SUrl.Type _type = SUrl.Type.temporary;
		
		if (StringUtil.isNotBlank(type))
		{
			try
			{
				_type = SUrl.Type.valueOf(type);
			} catch(Exception e)
			{
				throw new BusinessException(
					ErrorCode.INVALID_TYPE, I18N.tr(ErrorCodeStr.STR_INVALID_TYPE));
			}
		}
		
		String ip = _request.getRemoteAddr();

		response.setResult(SUrlData.valueOf(sUrlManager.set(url, _type, ip)));

		return response;
	}
	
	@ResponseBody
	@RequestMapping("/get")
	public Response<SUrlData> get(String surl)
	{
		Response<SUrlData> response = new Response<SUrlData>();

		response.setResult(SUrlData.valueOf(sUrlManager.get(surl)));
		if (response.getResult() == null)
		{
			throw new BusinessException(
				ErrorCode.NOT_FOUND, I18N.tr(ErrorCodeStr.STR_NOT_FOUND));
		}
		
		return response;
	}
	
	@RequestMapping("/r/{surl}")
	public String redirect(@PathVariable("surl") String surl)
	{
		Response<SUrlData> response = get(surl);

		return "redirect:" + response.getResult().getUrl();
	}
}
