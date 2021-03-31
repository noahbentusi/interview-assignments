package com.sequoiacap.taglibs;

import com.sequoiacap.utils.JsonHelper;

import net.jhorstmann.i18n.I18N;

public class BaseTags
{
	public static String json(Object data)
    {
        String json = JsonHelper.formatJson(data);

        return json;
    }

	public static String i18n(Object data)
	{
		return I18N.tr(String.valueOf(data));
	}
}
