package com.sequoiacap.errorcode;

public class ErrorCodeStr
{
	/** 正确 */
	public static final int OK = 200;

	/** 没有登录或登录Token过期 */
	public static final int ERROR_NOAUTH = 401;

	/** 取现无余额 */
	public static final String ERROR_WITHDRAW_NO_BALANCE_1400 = "超出本次可提现金额";
	
	/** 无法回滚取现 */
	public static final String ERROR_WITHDRAW_ROLLBACK_WRONG_STATE_1401 = "无法回滚取现";
	
	/** 不支持的文档存储器 */
	public static final String ERROR_NO_SUPPORT_DOC_PROVIDER_1402 = "不支持的文档存储器";
	
	/** 不支持的消息渠道 */
	public static final String ERROR_NO_SUPPORT_PUSHWAY_1403 = "不支持的消息渠道";
	
	/** 无法评论，因为订单状态不正确 */
	public static final String ERROR_JUDGED_WRONG_ORDERSTATE_1404 = "抱歉，更新失败，请您再次尝试";
	
	/** 无法接单，因为无相关订单 */
	public static final String ERROR_ACCEPT_NO_ORDER_1405 = "无法接单，因为无相关订单";
	
	/** 无法创建订单，因为已有分派订单 */
	public static final String ERROR_CREATE_WITH_ASSIGNING_1406 = "呼叫失败，请您再次尝试";
	
	/** 无法创建订单，因为预约时间已失效 */
	public static final String ERROR_CREATE_WITHOUT_BOOKTIME_1407 = "呼叫失败，请您再次尝试";
	
	/** 无法确认订单，因为状态不正确 */
	public static final String ERROR_CONFIRM_WRONG_ORDERSTATE_1408 = "报价确认失败，请稍后再次尝试";
	
	/** 无法完成维修，因为状态不正确 */
	public static final String ERROR_SERVICED_WRNONG_ORDERSTATE_1409 = "无法完成维修，因为状态不正确";
	
	/** 无法支付订单，因为状态不正确 */
	public static final String ERROR_PAY_WRONG_ORDERSTATE_1410 = "支付失败，请您再次尝试";
	
	/** 无法完成支付，因为状态不正确 */
	public static final String ERROR_PAID_WRNONG_ORDERSTATE_1411 = "无法完成支付，因为状态不正确";
	
	/** 无法完成支付，因为支付状态不正确 */
	public static final String ERROR_PAID_WRNONG_BILLSTATE_1412 = "无法完成支付，因为支付状态不正确";
	
	/** 无法取消订单，因为状态不正确 */
	public static final String ERROR_CANCEL_WRONG_ORDERSTATE_1413 = "取消失败，请您再次尝试";
	
	/** 无法退款，因为状态不正确 */
	public static final String ERROR_REFUND_WRNONG_ORDERSTATE_1414 = "无法退款，因为状态不正确";
	
	/** 无法退款，因为状态不正确 */
	public static final String ERROR_REFUND_WRNONG_ORDERSTATE_1414_1 = "无法退款，因为订单已经分润";
	
	/** 无法完成退款，因为支付状态不正确 */
	public static final String ERROR_REFUNDED_WRNONG_BILLSTATE_1415 = "无法完成退款，因为支付状态不正确";
	
	/** 不支付退款 */
	public static final String ERROR_NO_SUPPORT_REFUND_1416 = "不支持退款";
	
	/** 不支付确认完成付款 */
	public static final String ERROR_NO_CONFIRM_PAID_1417 = "不支持确认完成付款";
	
	/** 找不到支付单 */
	public static final String ERROR_NOT_FOUND_BILL_1418 = "找不到支付单";
	
	/** 不支持的支付方式 */
	public static final String ERROR_NO_SUPPORT_PAYWAY_1419 = "不支持的支付方式";
	
	/** 无法关闭支付，因为支付状态不正确 */
	public static final String ERROR_CLOSE_BILL_WRONG_BILLSTATE_1420 = "无法关闭支付，因为支付状态不正确";
	
	/** 找不到退款单 */
	public static final String ERROR_NOT_FOUND_REFUND_1421 = "找不到退款单";
	
	/** 登录失败，找不到用户登录认证 */
	public static final String ERROR_LOGIN_NOT_FOUND_IDENTITY_1422 = "您的手机号尚未注册，快来加入玛丽修吧";
	
	/** 登录失败，工人尚在审核 */
	public static final String ERROR_LOGIN_WORKER_AUDITING_1423 = "您的信息正在审核中，不能登录。有问题请联系客服";

	
	/** 登录失败，工人尚在审核 */
	public static final String ERROR_LOGIN_WORKER_AUDITING_1423_b = "您的信息未通过审核，不能登录。有问题请联系客服";
	
	/** 登录失败，工人尚在审核 */
	public static final String ERROR_LOGIN_WORKER_AUDITING_1423_c = "您的信息已被下线，不能登录。有问题请联系客服";

	/** 登录失败，工人失效 */
	public static final String ERROR_LOGIN_WORKER_INVALIDATED_1424 = "登录失败，工人失效";
	
	/** 不支持的登录方式 */
	public static final String ERROR_LOGIN_NO_SUPPORT_IDENTITY_TYPE_1425 = "登录失败，请您再次尝试";
	
	/** 无效的验证码 */
	public static final String ERROR_INVALID_ACKNOWLEDGE_1426 = "验证码错误，无法登录";
	
	/** 不支持的Token */
	public static final String ERROR_NO_SUPPORT_TOKEN_1427 = "登录失败，请您再次尝试";
	
	/** 找不到兑换码 */
	public static final String ERROR_NO_FOUND_TSTAMP_CODE_1428 = "兑换码有误，请您再次尝试";
	
	/** 兑换码已使用 */
	public static final String ERROR_USED_TSTAMP_CODE_1429 = "兑换码有误，请您再次尝试";
	
	/** 该订单不属于当前用户 */
	public static final String ERROR_ORDER_GRANTED_1430 = "取消失败，请您再次尝试";
	
	/** 该订单不属于当前用户 */
	public static final String ERROR_ORDER_GRANTED_FINSH_1430 = "发送失败，请您再次尝试";
	
	/** 该订单不属于当前用户 */
	public static final String ERROR_ORDER_GRANTED_EVALUATE_1430 = "报价发送失败，请您再次尝试";

	/** 该订单不属于当前用户 */
	public static final String ERROR_ORDER_GRANTED_CONFIRM_1430 = "报价确认失败，请您再次尝试";
	
	/** 无效的地理坐标 */
	public static final String ERROR_INVALIED_POI_1431 = "呼叫失败，请您再次尝试";
	
	/** 无效的地理坐标 */
	public static final String ERROR_INVALIED_POI_UPDATE_1431 = "更新失败，请您再次尝试";
	
	/** 无效的用户字段 */
	public static final String ERROR_INVALIED_FIELD_1432 = "无效的用户字段";
	
	/** 无法接单，因为当前状态不正确 */
	public static final String ERROR_STANDBY_WRONG_WORKERSTATE_1433 = "无法接单，因为当前状态不正确";
	
	/** 无法取现，因为当天不开放取现 */
	public static final String ERROR_WITHDRAW_NOT_OPEN_TODAY_1434 = "无法取现，因为当天不开放取现";
	
	/** 无法注册，因为用户信息不全 */
	public static final String ERROR_REGISTER_INCOMPLETE_USERINFO_1435 = "无法注册，因为用户信息不全";
	
	/** 无法注册，用户已存在 */
	public static final String ERROR_REGISTER_USER_EXISTS_1436 = "无法注册，用户已存在";
	
	/** 错误的字段值 */
	public static final String ERROR_INVALIED_FIELD_VALUE_1437 = "错误的字段值";

	/** 无法休息，因为当前状态不正确 */
	public static final String ERROR_RESTING_WRONG_WORKERSTATE_1438 = "无法休息，因为当前状态不正确";
	
	/** 无法审核通过，因为当前状态不正确 */
	public static final String ERROR_AUDITED_WRONG_WORKERSTATE_1439 = "无法审核通过，因为当前状态不正确";
	
	/** 账号禁用 */
	public static final String ERROR_BAN_WRONG_WORKERSTATE_1440 = "账号禁用";
	
	/** 用户已取消订单 */
	public static final String ERROR_ORDER_STATE_CANCEL_1441 = "用户已取消订单";
	
	/** 获取数据失败 */
	public static final String ERROR_LOAD_DATA = "数据加载失败，请您再次尝试";
	
	/** 上传数据失败 */
	public static final String ERROR_UPDATE_DATA = "抱歉，更新失败，请您再次尝试"; 
	
	/** 无效的手机号 */
	public static final String ERROR_INVALID_PHONE_1442 = "无效的手机号";
	

	/** 无效的手机号 */
	public static final String ERROR_PAY_1443 = "支付失败，请您再次尝试";

	/** 取现无银行信息 */
	public static final String ERROR_WITHDRAW_WITHOUT_ACCOUNTINFO_1450 = "请您联系客服申请绑定一张银行卡后才能提现";
	
	/** 无法确认订单，因为状态不正确 */
	public static final String ERROR_EVALUATE_WRONG_ORDERSTATE_1451 = "报价提交失败，请稍后再次尝试";
	
	/** 未通过审核 */
	public static final String ERROR_NO_PASS_AUDIT_1452 = "您已提交申请，审核未通过，有问题请联系客服";
	
	/** 审核中 */
	public static final String ERROR_AUDITING_1453 = "您已提交申请，当前正在审核中，有问题请联系客服";
	
	/** 已上线 */
	public static final String ERROR_ALREADY_ONLINE_1454 = "您已加入玛丽修，可直接登录，如需变更手机号，请联系客服";
	
	/** 手机号格式不正确 */
	public static final String ERROR_Phone_Number_Format_1455 = "请输入正确的手机号";
	
	/** 手机号已被注册 */
	public static final String ERROR_Phone_Registered_1456 = "您的手机号已注册玛丽修，可以直接登录或更换手机号再次申请";

	public static final String ERROR_ITEM_ZERO_NUMBER_1457 = "报价提交失败，有服务项目数量为0";
	
	public static final String ERROR_NO_EXTENSIONWORKER_1458 = "您不属于推广工人，无法提交订单。";
	
	public static final String ERROR_NO_ANONYMOUS_USER_1459 = "客户手机号已注册，不能建立订单。";
	
	public static final String ERROR_USER_AS_WORKER_1460 = "手机号为玛丽修维修师手机号，不能建立订单。";

	/** 无法确认订单，因为状态不正确 */
	public static final String ERROR_EVALUATE_WRONG_EMPTY_1461 = "报价提交失败，因为报价单为空。";

	/** 兑换码已用完 */
	public static final String ERROR_MAX_TSTAMP_CODE_1458 = "兑换码无效，请重新输入";
	
	/** 已绑定银行卡 */
	public static final String ERROR_BIND_BANK_CARD_ALREADY_1459 = "已绑定银行卡";
}
