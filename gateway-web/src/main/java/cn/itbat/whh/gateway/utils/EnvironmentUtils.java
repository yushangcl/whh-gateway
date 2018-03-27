package cn.itbat.whh.gateway.utils;


/**
 *
 * @author: wendong.hu
 * @Date: 2017/11/13
 * @Time: 15:51
 * @Description:
 */
public class EnvironmentUtils {

  /**
   * dev环境标示符
   */
  private static final String DEV_ENVIRONMENT_SIGN = "dev";

  /**
   * cit环境标示符
   */
  private static final String CIT_ENVIRONMENT_SIGN = "cit";

  /**
   * 判断运行期网关所处环境
   * @return 所处环境字符串 dev,cit,uat,pro
   */
  public static String getEnvironment() {
    String env = WebConfigUtils.webConfig.getDubboVersion();
    char[] chars = env.toCharArray();
    int index = -1;
    for (int i = 0; i < chars.length; i++) {
      if (Character.isDigit(chars[i])) {
        index = i;
        break;
      }
    }
    if (index != -1) {
      return env.substring(0, index);
    }
    return env;
  }

}