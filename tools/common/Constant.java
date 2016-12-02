package com.doctoryun.common;

/**
 * Created by Adolf Li on 2015/7/16 0016.
 */
public class Constant {

    public static boolean SIGN_VALID = true;
    public static boolean CAN_RELOGIN = true;
    public static final String EXIT = "exit";
    public static final String PLATFORM = "doctor";
    //    public static String url = "http://114.215.238.101:9988";//"http://www.winged-tech.com:8080";
    public static String url = "http://www.winged-tech.com:8080";//"http://www.winged-tech.com:8080";
    public static String urlWv = "http://114.215.238.101/web_view";//"http://www.winged-tech.com:8080";

    public static final String TYPE_INTERVIEW = "1";
    public static final String TYPE_IN_HOSPITAL = "2";
    public static final String TYPE_PEDIA = "1";
    public static final String TYPE_NEWS = "2";
    public static final String TYPE_FROM_ONE = "1";
    public static final String TYPE_ZERO = "0";
    public static final String TYPE_DOCTOR_PATIENTS = "1";
    public static final String TYPE_MEDGROUP_PATIENTS = "3";
    public static final String TYPE_DOCTOR = "2";
    public static final String TYPE_PATIENTS = "3";

    public static final String FILTER_END_IN = "0";
    public static final String FILTER_IN = "1";
    public static final String FILTER_END = "2";
    public static final String FILTER_PAUSE = "3";
    public static final String FILTER_CANCEL = "4";
    public static final String PARAM_IS_FIRST = "isfirst";


    public static final String PARAM_COMMENT_ZAN = "1";
    public static final String PARAM_COMMENT_CONTENT = "2";
    public static final String PARAM_COMMENT_TOCOMMENT = "3";

    public static final String URL_PATIENT_HISTORY = "/query/patients_progress_notes";
    public static final String URL_PIC_UPLOAD = "/query/user_login";
    public static final String URL_LOGIN = "/query/user_login";
    public static final String URL_GET_CODE = "/query/user_sm_code";
    public static final String URL_UPDATE_SET_VIP = "/update/set_vip";
    public static final String URL_DEPARTMENT_LIST = "/query/get_department_list";
    public static final String URL_HOSPITAL_LIST = "/query/get_hospital_list";
    public static final String URL_USER_INFO = "/query/user_info";
    public static final String URL_MEDGRP_INFO = "/query/get_my_medgroup_info";
    public static final String URL_HOME_SEARCH = "/query/search";
    public static final String URL_USER_INFO_UPDATE = "/update/user_info";
    public static final String URL_GET_GRP_LIST_INFO = "/query/get_doctorgroups";
    public static final String URL_GRP_INFO_UPDATE = "/update/update_medgroup_info";
    public static final String URL_CODE_VALID = "/query/user_pwd_reset_valid";
    public static final String URL_REGIST = "/update/user_regist_rsa";
    public static final String URL_CHANGEPASS = "/update/change_pwd";
    public static final String URL_DEPARTMENT_LISTS = "/query/get_hospital_department_List";
    public static final String URL_RESET_PWD = "/update/user_pwd_reset_commit_aes";
    public static final String URL_SYSTEM_TEMPLATE = "/query/sysdepart_wptempalte_list";
    public static final String URL_MY_TEMPLATE = "/query/user_wptemplate_list";
    public static final String URL_UPDATE_SHARE_HOMEPAGE_TO_PATIENT = "/update/share_homepage_to_patient";
    public static final String URL_NEW_SHARE_ARTICLE_TO_PATIENT = "/new/share_article_to_patient";
    public static final String URL_DEPART_TEMPLATE = "/query/shared_wptemplate_list";
    public static final String URL_USER_WPTEMPLATE = "/query/user_wptemplate";
    public static final String URL_PATIENT_AGENDA_LIST = "/query/patient_wpagenda_list";
    public static final String URL_LATEST_ANDROID_VERSION = "/query/system_param";
    public static final String URL_GET_USER_PHOTO = "/query/get_user_photo";
    public static final String URL_NUM_TEMPLATE = "/query/sys_wptempalte_numlist";
    public static final String URL_PEDIA_INFO = "/query/user_wparticle";
    public static final String URL_MY_PEDIA = "/query/user_wparticle_list";
    public static final String URL_ARTICLE_COLLECTION_LIST = "/query/article_collection_list";
    public static final String URL_RESET_PHONE = "/update/reset_phone";
    public static final String URL_REQ_REACTION = "/update/patient_req_reaction";
    public static final String URL_GET_CONVERSIONID = "/query/get_conversion";
    public static final String URL_COLLECTION_NEW_ARTICLE = "/new/article_collection";
    public static final String URL_COLLECTION_WPTEMPLATE = "/query/user_wptemplate_collection_list";
    public static final String URL_SINGLE_PATIENT_NEWS = "/query/single_patient_news";
    public static final String URL_COLLECTION_DELETE_ARTICLE = "/rm/article_collection";
    public static final String URL_RM_WPARTICLE = "/rm/user_wparticle";
    public static final String URL_SYSTEM_PEDIA = "/query/sysdepart_wparticle_list";
    public static final String URL_GET_PATIENTS_SEND_BANNER = "/query/get_patients_send_banner";
    public static final String URL_NUM_PEDIA = "/query/sys_wparticle_list";
    public static final String URL_NUM_PEDIA_LIST = "/query/sys_wparticle_numlist";
    public static final String URL_DEPART_PEDIA = "/query/shared_wparticle_list";
    public static final String URL_ADD_SCHEDULE = "/new/user_wpagenda";
    public static final String URL_UPDATE_SCHEDULE = "/update/user_wpagenda";
    public static final String URL_SCHEDULE_LIST = "/query/user_wpagenda_list";
    public static final String URL_RM_USER_WPAGENDA = "/rm/user_wpagenda";
    public static final String URL_NEW_PROGRESS_NOTE = "/update/new_progress_note";
    public static final String URL_SCHEDULE_LIST_MONTH = "/query/user_wpagenda_monthdig";
    public static final String URL_SCHEDULE_DETAIL = "/query/user_wpagenda";
    public static final String URL_GET_PROGRESS_NOTE = "/query/get_progress_note";
    public static final String URL_PLAN_LIST = "/query/user_wpplan_list";
    public static final String URL_SHARE_ARTICLE_TO_HOMEPAGE = "/new/share_article_to_homepage";
    public static final String URL_GET_NEWS_NUMBER = "/query/get_news_number";
    public static final String URL_ADD_TEMPLATE = "/new/user_wptemplate";
    public static final String URL_UPDATE_TEMPLATE = "/update/user_wptemplate";
    public static final String URL_UPDATE_UPDATE_PROGRESS_NOTE = "/update/update_progress_note";
    public static final String URL_DEL_TEMPLATE = "/rm/user_wptemplate";
    public static final String URL_DEL_COLLTEMPLATE = "/rm/user_wptemplate_collection";
    public static final String URL_NEW_USER_WPTEMPLATE_COLLECTION = "/new/user_wptemplate_collection";
    public static final String URL_HOME_NEWS = "/query/home_news_digest";
    public static final String URL_USER_WPARTICLE_SHARE = "/query/user_wparticle_share";
    public static final String URL_HOME_ADS = "/query/home_advertise";
    public static final String URL_FILE_UPLOAD = "/update/file_upload";
    public static final String URL_UPDATE_DELETE_PROGRESS_NOTE = "/update/delete_progress_note";
    public static final String URL_ADD_PEDIA = "/new/user_wparticle";
    public static final String URL_UPDATE_PEDIA = "/update/user_wparticle";
    public static final String URL_PATIENTS_IN_GROUP = "/query/patients_in_group";
    public static final String URL_DOCTOR_PROVIDED_SERVICES = "/query/doctor_provided_services";
    public static final String URL_ADD_PLAN = "/new/user_wpplan";
    public static final String URL_CHANGE_USER_WPPLAN_STATUS = "/change/user_wpplan_status";
    public static final String URL_TEMPLATE_DETAIL = "/query/user_wptemplate";
    public static final String URL_PLAN_DETAIL = "/query/user_wpplan";
    public static final String URL_UPDATE_PLAN = "/update/user_wpplan";
    public static final String URL_UPDATE_PLAN_STATUS = "/update/user_wpplan_status";
    public static final String URL_RM_PLAN = "/rm/user_wpplan";
    public static final String URL_PATIENT_DETAIL = "/query/patient_info";
    public static final String URL_USER_PATIENT_PLAN_NUM = "/query/user_patient_plan_num";
    public static final String URL_UPDATE_SERVICE_OF_DOCTOR = "/update/set_service_of_doctor";
    public static final String URL_PATIENT_REQUEST = "/query/patients_requests";
    public static final String URL_REQUEST_HISTORY = "/query/patients_requests_history";
    public static final String URL_PATIENT_OF_HIS = "/query/patients_of_history";
    public static final String URL_ADD_GROUP = "/update/add_patient_group";
    public static final String URL_DEL_GROUP = "/update/delete_group";
    public static final String URL_REFERRAL_SEARCH = "/query/referral_search";
    public static final String URL_UPDATE_SET_NOTICE_READED = "/update/set_notice_readed";
    public static final String URL_UPDATE_GROUP = "/update/update_patients_group";
    public static final String URL_SET_SERVICE = "/update/set_service";
    public static final String URL_BIND_RELEASE = "/update/release_bind";
    public static final String URL_WORK_NEWS = "/query/work_news";
    public static final String URL_DOCTOR_QUALIFY_INFO = "/query/doctor_qualify_info";
    public static final String URL_DOCTOR_PLAN_NUM = "/query/user_doctor_plan_num";
    public static final String URL_BIND_DELETE_BIND = "/update/delete_bind";
    public static final String URL_GET_STATISTIC = "/query/doctor_work_statistic";
    public static final String URL_GET_SERVICE = "/query/get_service_of_doctor";
    public static final String URL_GET_PATIENTS_NEWS = "/query/patients_news";


    //朋友圈
    public static final String URL_NEW_USER_CIRCLE_ARTICLE = "/new/user_circle_article";
    public static final String URL_QUERY_USER_FRIEND_ARTICLE_LIST = "/query/user_friend_article_list";//动态列表
    public static final String URL_NEW_USER_CIRCLE_ARTICLE_COMMENT = "/new/user_circle_article_comment";
    public static final String URL_UPDATE_USER_CIRCLE_ARTICLE_COMMENT = "/update/user_circle_article_comment";
    public static final String HOSPITAL_LIST = "/query/get_hospital_list";//获取医院列表
    public static final String URL_DOCTORS = "/query/get_doctors";//获取医生列表
    public static final String URL_NEW_CIRCLR_REQUEST = "/new/friend_circle_request";//新建好友申请
    public static final String URL_CIRCLR_REQUEST_LIST = "/query/friend_circle_request_list";//获取申请列表
    public static final String URL_ACEPT_CIRCLE_REQUEST = "/accept/friend_circle_request";//接收好友申请
    public static final String URL_QUERY_USER_FRIEND_LIST = "/query/user_friend_circle_list";//好友列表
    public static final String URL_QUERY_GET_DOC_INFO = "/query/get_doctor_info";//获取医生信息
    public static final String URL_QUERY_FRIEND_CIRCLE_REQ_NUM = "/query/friend_circle_req_num";//申请数目
    public static final String URL_QUERY_GET_FRIEND_GROUP_LIST = "/query/get_friend_group_list";//群组列表
    public static final String URL_NEW_FRIEND_GROUP = "/new/friend_group";//创建群组
    public static final String URL_UPDATE_FRIEND_GROUP = "/update/friend_group";//更新群组
    public static final String URL_DELETE_FRIEND_GROUP = "/delete/friend_group";//删除群组
    public static final String URL_QUERY_FRIEND_GROUP_INFO = "/query/friend_group_info";//创建群组
    public static final String URL_QUERY_PATIENT_SIMPLE_INFO = "/query/patient_simple_info";//创建群组
    public static final String URL_QUERY_FRIEND_CIRCLE_ARTICLE_LIST = "/query/user_friend_circle_article_list";//好友动态列表
    public static final String URL_QUERY_FRIEND_ARTICLE = "/query/user_friend_article";//好友动态列表


    public static final String URL_REQUEST_OUTSERV_LIST = "/query/user_outpatient_service";
    public static final String URL_UPDATE_OUTSERV_LIST = "/update/user_outpatient_service";
    public static final String PARAM_ACCOUNT = "account";
    public static final String PARAM_PASSWORD = "password";
    public static final String PARAM_SIGN = "sign";
    public static final String PARAM_PLATFORM = "platform";
    public static final String PARAM_PHONE = "phone";
    public static final String PARAM_PHONE_NEW = "new_phone";
    public static final String PARAM_PWD = "pwd";
    public static final String PARAM_NEWS_TYPE = "news_type";
    public static final String PARAM_MANAGER_TYPE = "manager_type";
    public static final String PARAM_SMSCODE = "smCode";
    public static final String PARAM_ID = "id";
    public static final String PARAM_NOTICE_ID = "notice_id";
    public static final String PARAM_NEWPWD = "newPwd";
    public static final String PARAM_USERID = "userId";
    public static final String PARAM_DOCTORID = "doctorId";
    public static final String PARAM_REQID = "reqId";
    public static final String PARAM_CONVERSION = "conversion";
    public static final String PARAM_RESP = "resp";
    public static final String NEW_PWD = "new_pwd";
    public static final String OLD_PWD = "old_pwd";
    public static final String PARAM_PAGE_INDEX = "page_index";
    public static final String PARAM_PAGE_SIZE = "page_size";
    public static final String PARAM_PARENTID = "parentId";
    public static final String USER_PHONE = "userPhone";
    public static final String POSITION = "position";
    public static final String USER_SCHEME_CATEGORY = "scheme_category";
    public static final String PARAM_REVID = "receiver_id";
    public static final String PARAM_SENDERID = "sender_id";
    public static final String PARAM_CONVERSION_ID = "conversion_id";
    public static final String PARAM_KEYWORDS = "key";
    public static final String PARAM_TYPE = "type";
    public static final String PARAM_IS_DELETE = "is_delete";
    public static final String PARAM_QRTYPE = "qrType";
    public static final String PARAM_SELECT_FROM = "select_from";
    public static final String PARAM_IS_EDITABLE = "is_editable";
    public static final String PARAM_PM_TYPE = "PM_TYPE";
    public static final String PARAM_DELETE = "delete";
    public static final String PARAM_GROUPID = "groupId";
    public static final String PARAM_PATIENT_ID = "patientId";
    public static final String PARAM_PATIENT_ID2 = "patient_id";
    public static final String PARAM_REQUESTID = "requestId";
    public static final String PARAM_COMMENT_ID = "comment_id";
    public static final String PARAM_PID = "pId";
    public static final String PARAM_PNID = "pnId";
    public static final String PARAM_PNID2 = "pn_id";
    public static final String PARAM_FROM = "from";
    public static final String PARAM_FRIENDID = "friendId";
    public static final String PEDIA_GET = "get";
    public static final String FRIEND_ID = "friendId";
    public static final String PARAM_SET = "set";
    public static final String PARAM_SERVICE_NAME = "servName";
    public static final String PARAM_TITLE = "title";
    public static final String PARAM_CONTENT = "content";
    public static final String PARAM_IS_COLLECTION = "isCollection";
    public static final String PARAM_EXECUTER_ID = "executer_id";
    public static final String PARAM_MEDICAL_DATE = "medical_date";
    public static final String PARAM_DIANOGUE = "dianogue";
    public static final String PARAM_USER_GROUP_ID = "user_group_id";
    public static final String PARAM_COMPLIMENT = "compliment";
    public static final String PARAM_CREATOR_NAME = "creator_name";
    public static final String PARAM_IS_CONFIRMED = "is_confirmed";
    public static final String PARAM_EXECUTE_DATE = "execute_date";
    public static final String PARAM_CONFIRM_DATE = "confirm_date";
    public static final String PARAM_EXECUTER_NAME = "executer_name";
    public static final String PARAM_REMIND_ME = "remind_me";
    public static final String PARAM_REMIND_DATE = "remind_date";
    public static final String PARAM_REMIND_TYPE = "remind_type";
    public static final String PARAM_REMIND_PATIENT = "remind_patient";
    public static final String PARAM_DATE = "date";
    public static final String PARAM_BUNDLE_ENTITY = "bundle_entity";
    public static final String PARAM_BUNDLE = "bundle";
    public static final String PARAM_SYS_DEPARTMENT_ID = "sysdepartment_id";
    public static final String PARAM_SYS_DEPARTMENT_NAME = "sysdepartment_name";
    public static final String PARAM_DEPARTMENT_ID = "departmentId";
    public static final String PARAM_GROUP_NAME = "department_name";
    public static final String PARAM_GROUP_ID = "group_name";
    public static final String PARAM_DEPARTMENT_NAME = "group_id";
    public static final String PARAM_HOSPITAL_ID = "hospital_id";
    public static final String PARAM_HOSPITAL_ID2 = "hospitalId";
    public static final String DEPARTMENT_ID = "departmentId";
    public static final String PARAM_HOSPITAL_NAME = "hospital";
    public static final String PARAM_FILTER = "filter";
    public static final String PARAM_NAME = "name";
    public static final String PARAM_MEMBER = "member";
    public static final String PARAM_INTENT_PID = "pId";
    public static final String PARAM_MEMBERS = "members";
    public static final String PARAM_MEDGRP_NAME = "group_name";
    public static final String PARAM_SEX = "sex";
    public static final String PARAM_SCHEDULE_ID = "wpagenda_id";
    public static final String PARAM_AGENDA_ID = "agenda_id";
    public static final String PARAM_WPAGENDA_ID = "wpagendaId";
    public static final String PARAM_WPARTICLE_ID = "wparticleId";
    public static final String PARAM_ARTICLE_ID = "articleId";
    public static final String PARAM_ARTICLE_ID2 = "article_id";
    public static final String PARAM_WPARTICLE_TITLE = "wparticletitle";
    public static final String PARAM_WPARTICLE_CONTENT = "wparticlecontent";
    public static final String PARAM_WPARTICLE_SOURSE = "wparticlesourse";
    public static final String PARAM_WPARTICLE_TYPE = "type";
    public static final String PARAM_PHOTO = "photo";
    public static final String PARAM_MEDGRP_PHOTO = "group_photo";
    public static final String PARAM_PHOTO_TYPE = "photoType";
    public static final String PARAM_EXPERTISE = "expertise";
    public static final String PARAM_MEDGRP_EXPERTISE = "group_expertise";
    public static final String PARAM_THECHNICAL_TITLE = "technical_title";
    public static final String PARAM_DETAIL_INFO = "detail_info";
    public static final String PARAM_MEDGRP_DESCRIPTION = "group_description";
    public static final String PARAM_MEDICAL_GROUP_NAME = "medical_group_name";
    public static final String PARAM_MEDICAL_GROUP_ID = "medical_group_id";
    public static final String PARAM_MEDICAL_GROUP_ROLE = "medical_group_role";
    public static final String PARAM_GROUP_DEPARTMENT = "medical_group_department";
    public static final String PARAM_IS_SHARE = "is_share";
    public static final String PARAM_DETAILS = "details";
    public static final String PARAM_AGENDAS = "agendas";
    public static final String PARAM_FILE_TYPE = "fileType";
    public static final String PARAM_IS_AD = "is_ad";
    public static final String PARAM_IS_VIP = "is_vip";
    public static final String PARAM_IS_PCFORMAT = "is_pcformat";
    public static final String PARAM_IMAGE_PATH = "image_path";
    public static final String PARAM_IMAGES = "images";
    public static final String PARAM_STATUS = "status";
    public static final String PARAM_TEMPLATE_NAME = "temp_name";
    public static final String PARAM_TEMP_IS_SHARE = "temp_is_share";
    public static final String PARAM_TEMP_TYPE = "temp_type";
    public static final String PARAM_TEMPLATE_ID = "wptemplate_id";
    public static final String PARAM_TEMPLATE_ID2 = "wptemplateId";
    public static final String PARAM_TEMPLATE_TITLE = "wptemplate_title";
    public static final String PARAM_DETAIL_ID = "detail_id";
    public static final String PARAM_ARTICLES = "articles";
    public static final String PARAM_CREATE_DATE = "create_date";
    public static final String PARAM_PLAN_ID = "wpplanId";
    public static final String PARAM_SORT_TYPE = "sort_type";
    public static final String PARAM_SORT_NUMBER = "sort_num";
    public static final String PARAM_SERVICES = "services";
    public static final String PARAM_MEFILEID = "medFileId";
    public static final String PARAM_MEFILES = "medFiles";
    public static final String SCHEDULE_ID = "schedule_id";
    public static final String SCHEDULE_TYPE = "schedule_type";
    public static final String PATIENT_NAME = "patient_name";
    public static final String PATIENT_CURRENT_TAB = "patient_current_tab";
    public static final String PATIENT_AVATAR = "patient_avatar";
    public static final String PARAM_CLASS_TYPE = "class_type";


    public static final String LABEL = "label";
    public static final String title = "title";
    public static final String topName = "topname";
    public static final String cunt = "cunt";
    public static final String content = "content";

    public static final String OPTION = "option";
    public static final String PM_TYPE = "PM_TYPE";
    public static final String OPTION_GROUP_MESSAGE = "groupMessage";
    public static final String OPTION_GROUP_MANAGE = "groupManage";
    public static final String PATIENT_SELECT = "selectPatient";
    public static final String PATIENT_MULTI_SELECT = "multiSelectPatient";
    public static final String INTENT_URL = "intent_url";
    public static final String INTENTINFO = "intentInfo";


    public static final String PREFERENCE_COUNT = "preference_count";
    public static final String PREFERENCE_TOKEN = "preference_token";
    public static final String PREFERENCE_USERNAME = "preference_username";
    public static final String PREFERENCE_ID = "preference_id";
    public static final String PREFERENCE_NAME = "preference_name";
    public static final String PREFERENCE_EMAIL = "preference_email";
    public static final String PREFERENCE_SEX = "preference_sex";
    public static final String PREFERENCE_BIR = "preference_birthday";
    public static final String PREFERENCE_PHOTO = "preference_photo";
    public static final String PREFERENCE_PHONE = "preference_phone";
    public static final String PREFERENCE_BANNERS = "preference_banners";
    public static final String PREFERENCE_DEPARTMENT_NAME = "preference_department_name";
    public static final String PREFERENCE_HOSPITAL = "preference_hospital";
    public static final String PREFERENCE_HOSPITAL_GRADE = "preference_hospital_grade";
    public static final String PREFERENCE_expertise = "preference_expertise";
    public static final String PREFERENCE_technical_title = "preference_technical_title";
    public static final String PREFERENCE_detail_info = "preference_detail_info";
    public static final String PREFERENCE_MEDICAL_GROUP_ID = "preference_medical_group_id";
    public static final String PARAM_SCREEN_WIDTH = "screenWidth";
    public static final String PARAM_SCREEN_HEIGHT = "screenHeight";
    public static final String PREFERENCE_medical_group_department = "preference_medical_group_department";
    public static final String PREFERENCE_medical_group_name = "preference_medical_group_name";
    public static final String PREFERENCE_medical_group_role = "preference_medical_group_role";
    public static final String PREFERENCE_LIST_HOSTORY = "str_list_hostory";
    public static final String PREFERENCE_LIST_HOSTORY_USER = "str_list_hostory_user";
    public static final String PREFERENCE_LIST_HOSTORY_DOC = "str_list_hostory_doc";
    public static final String PREFERENCE_LIST_HOSTORY_DOC_ID = "str_list_hostory_doc_id";
    public static final String PREFERENCE_DEPARTMENT_ID = "preference_department_id";
    public static final String PREFERENCE_HOSPITAL_ID = "preference_hospital_id";
    public static final String PREFERENCE_MEDICAL_ID = "preference_medical_id";
    public static final String PREFERENCE_PATIENT_ID = "preference_patient_id";
    public static final String PREFERENCE_SYS_TIME_CHA = "preference_sys_time";
    public static final String PREFERENCE_ACCEPT_TIME = "preference_accetp_time";
    public static final String PREFERENCE_REACH_TIME = "preference_reach_time";
    public static final String PREFERENCE_DEFAULT_REACH_TIME = "preference_default_reach_time";
    public static final String PREFERENCE_IS_QUALIFYED = "preference_is_isQualifyed";
    public static final String PREFERENCE_IS_SERVICE_ON = "preference_is_service_on";
    public static final String PREFERENCE_IS_OFFLINE = "preference_off_line";

    public static final String PREFERENCE_IS_PUSH = "preference_is_push";
    public static final String PREFERENCE_IS_INTERVIEW = "preference_is_interview";
    public static final String PREFERENCE_IS_ONLINE = "preference_is_online";
    public static final String PREFERENCE_IS_INHOSPITAL = "preference_is_inhospital";
    public static final String PREFERENCE_IS_UP = "preference_is_up";
    public static final String URL_LOGIN_RSA = "/query/user_login_rsa";


    public static final String USE_WHERE_URL_TO_URL = "use_what_url_to_post";//判断使用哪个端口

    // activity return value
    public static final int TEXTVIEW_USER_EXPERTISE_REQ = 9001;
    public static final int TEXTVIEW_USER_EXPERTISE_RET = 9002;
    public static final int TEXTVIEW_USER_DETAIL_REQ = 9003;
    public static final int TEXTVIEW_USER_DETAIL_RET = 9004;
    public static final int SHARE_USER_QRCODETAB_REQ = 9005;
    public static final int DEPARTMENT_LIST_REQ = 9006;
    public static final int TEXTVIEW_MEDGROUP_EXPERTISE_REQ = 9007;
    public static final int TEXTVIEW_MEDGROUP_DETAIL_REQ = 9008;
    public static final int MEDGROUP_LIST_REQ = 9009;
    public static final int AGENDA_DETAIL_REQ = 9010;
    public static final int WPARTICLE_SELECT_REQ = 9011;

    public static final int VOLLET_RETRY_TIME_OUT_GET = 4000;
    public static final int VOLLET_RETRY_TIME_OUT_UP = 500000;


    public static final float BEEP_VOLUME = 0.10f;
    public static final long VIBRATE_DURATION = 200L;
}
