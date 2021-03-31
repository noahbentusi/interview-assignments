package com.sequoiacap.errorcode;

public class ErrorCode
{
	/** 正确 */
	public static final int OK = 200;

	/** 没有登录或登录Token过期 */
	public static final int ERROR_NOAUTH = 401;

	/** 取现无余额 */
	public static final int ERROR_WITHDRAW_NO_BALANCE = 1400;
	
	/** 无法回滚取现 */
	public static final int ERROR_WITHDRAW_ROLLBACK_WRONG_STATE = 1401;
	
	/** 不支持的文档存储器 */
	public static final int ERROR_NO_SUPPORT_DOC_PROVIDER = 1402;
	
	/** 不支持的消息渠道 */
	public static final int ERROR_NO_SUPPORT_PUSHWAY = 1403;
	
	/** 无法评论，因为订单状态不正确 */
	public static final int ERROR_JUDGED_WRONG_ORDERSTATE = 1404;
	
	/** 无法接单，因为无相关订单 */
	public static final int ERROR_ACCEPT_NO_ORDER = 1405;
	
	/** 无法创建订单，因为已有分派订单 */
	public static final int ERROR_CREATE_WITH_ASSIGNING = 1406;
	
	/** 无法创建订单，因为预约时间已失效 */
	public static final int ERROR_CREATE_WITHOUT_BOOKTIME = 1407;
	
	/** 无法确认订单，因为状态不正确 */
	public static final int ERROR_CONFIRM_WRONG_ORDERSTATE = 1408;
	
	/** 无法完成维修，因为状态不正确 */
	public static final int ERROR_SERVICED_WRNONG_ORDERSTATE = 1409;
	
	/** 无法支付订单，因为状态不正确 */
	public static final int ERROR_PAY_WRONG_ORDERSTATE = 1410;
	
	/** 无法完成支付，因为状态不正确 */
	public static final int ERROR_PAID_WRNONG_ORDERSTATE = 1411;
	
	/** 无法完成支付，因为支付状态不正确 */
	public static final int ERROR_PAID_WRNONG_BILLSTATE = 1412;
	
	/** 无法取消订单，因为状态不正确 */
	public static final int ERROR_CANCEL_WRONG_ORDERSTATE = 1413;
	
	/** 无法退款，因为状态不正确 */
	public static final int ERROR_REFUND_WRNONG_ORDERSTATE = 1414;
	
	/** 无法完成退款，因为支付状态不正确 */
	public static final int ERROR_REFUNDED_WRNONG_BILLSTATE = 1415;
	
	/** 不支付退款 */
	public static final int ERROR_NO_SUPPORT_REFUND = 1416;
	
	/** 不支付确认完成付款 */
	public static final int ERROR_NO_CONFIRM_PAID = 1417;
	
	/** 找不到支付单 */
	public static final int ERROR_NOT_FOUND_BILL = 1418;
	
	/** 不支持的支付方式 */
	public static final int ERROR_NO_SUPPORT_PAYWAY = 1419;
	
	/** 无法关闭支付，因为支付状态不正确 */
	public static final int ERROR_CLOSE_BILL_WRONG_BILLSTATE = 1420;
	
	/** 找不到退款单 */
	public static final int ERROR_NOT_FOUND_REFUND = 1421;
	
	/** 登录失败，找不到用户登录认证 */
	public static final int ERROR_LOGIN_NOT_FOUND_IDENTITY = 1422;
	
	/** 登录失败，工人尚在审核 */
	public static final int ERROR_LOGIN_WORKER_AUDITING = 1423;
	
	/** 登录失败，工人失效 */
	public static final int ERROR_LOGIN_WORKER_INVALIDATED = 1424;
	
	/** 不支持的登录方式 */
	public static final int ERROR_LOGIN_NO_SUPPORT_IDENTITY_TYPE = 1425;
	
	/** 无效的验证码 */
	public static final int ERROR_INVALID_ACKNOWLEDGE = 1426;
	
	/** 不支持的Token */
	public static final int ERROR_NO_SUPPORT_TOKEN = 1427;
	
	/** 找不到兑换码 */
	public static final int ERROR_NO_FOUND_TSTAMP_CODE = 1428;
	
	/** 兑换码已使用 */
	public static final int ERROR_USED_TSTAMP_CODE = 1429;
	
	/** 该订单不属于当前用户 */
	public static final int ERROR_ORDER_GRANTED = 1430;
	
	/** 无效的地理坐标 */
	public static final int ERROR_INVALIED_POI = 1431;
	
	/** 无效的用户字段 */
	public static final int ERROR_INVALIED_FIELD = 1432;
	
	/** 无法接单，因为当前状态不正确 */
	public static final int ERROR_STANDBY_WRONG_WORKERSTATE = 1433;
	
	/** 无法取现，因为当天不开放取现 */
	public static final int ERROR_WITHDRAW_NOT_OPEN_TODAY = 1434;
	
	/** 无法注册，因为用户信息不全 */
	public static final int ERROR_REGISTER_INCOMPLETE_USERINFO = 1435;
	
	/** 无法注册，用户已存在 */
	public static final int ERROR_REGISTER_USER_EXISTS = 1436;
	
	/** 错误的字段值 */
	public static final int ERROR_INVALIED_FIELD_VALUE = 1437;

	/** 无法休息，因为当前状态不正确 */
	public static final int ERROR_RESTING_WRONG_WORKERSTATE = 1438;
	
	/** 无法审核通过，因为当前状态不正确 */
	public static final int ERROR_AUDITED_WRONG_WORKERSTATE = 1439;
	
	public static final int ERROR_BAN_WRONG_WORKERSTATE = 1440;
	
	/** 无法完成支付，因为状态不正确 */
	public static final int ERROR_ORDER_STATE_CANCEL = 1441;
	
	/**
	 * 支付失败  请重试
	 */
	public static final int ERROR_PAY = 1443;

	/** 取现无银行信息 */
	public static final int ERROR_WITHDRAW_WITHOUT_ACCOUNTINFO = 1450;

	/** 无法报价订单，因为状态不正确 */
	public static final int ERROR_EVALUATE_WRONG_ORDERSTATE = 1451;
	
	/** 未通过审核 */
	public static final int ERROR_NO_PASS_AUDIT = 1452;
	
	/** 审核中 */
	public static final int ERROR_AUDITING = 1453;
	
	/** 已上线 */
	public static final int ERROR_ALREADY_ONLINE = 1454;
	
	/** 手机号格式不正确 */
	public static final int ERROR_Phone_Number_Format = 1455;

	/** 手机号已被注册 */
	public static final int ERROR_Phone_Registered = 1456;

	/** 报价有数量为0 */
	public static final int ERROR_ITEM_ZERO_NUMBER = 1457;
	
	/** 不是推广工人 */
	public static final int ERROR_NO_EXTENSIONWORKER = 1458;
	
	/** 不是未登录用户 */
	public static final int ERROR_NO_ANONYMOUS_USER = 1459;
	
	/** 是工人的客户 */
	public static final int ERROR_USER_AS_WORKER = 1460;
	
	/** 无法报价订单，因为报价单为空 */
	public static final int ERROR_EVALUATE_WRONG_EMPTY = 1461;

	/** 兑换码已超过最大数量 */
	public static final int ERROR_MAX_TSTAMP_CODE = 1458;

	/** 已绑定银行卡 */
	public static final int ERROR_BIND_BANK_CARD_ALREADY = 1459;
	
	/** 无支付网关 */
	public static final int ERROR_NO_PAYWAY = 1460;
}
