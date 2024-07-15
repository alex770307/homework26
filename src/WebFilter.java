public class WebFilter implements Filter{
    private static final String ACCESS_WEB_URL_TO_ADMIN = "https://";
    private static final String ACCESS_WEB_URL_TO_USER = "https://web-for-user";
    private static final String ACCESS_WEB_URL_TO_TEEN = "https://web-for-teen";

    public boolean checkAccess(String websiteUrl, Role role) {


        if (role.equals(Role.ADMIN)
                && websiteUrl.startsWith(ACCESS_WEB_URL_TO_ADMIN)) {
            Printer.printAnswers();
            return true;
        } else if (role.equals(Role.USER)
                && websiteUrl.startsWith(ACCESS_WEB_URL_TO_USER)) {
            Printer.printAnswers();
            return true;
        } else if (role.equals(Role.TEEN)
                && websiteUrl.startsWith(ACCESS_WEB_URL_TO_TEEN)) {
            Printer.printAnswers();
            return true;
        } else {
            Printer.printAnswer();
            return false;
        }

    }
}
