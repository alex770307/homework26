public interface Filter {
    boolean checkAccess(String websiteUrl, Role role);
}
