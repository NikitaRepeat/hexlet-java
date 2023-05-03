class App {
    public static String checkSecurity(Url url) {
        // BEGIN (write your solution here)
        if (url.getProtocol() == "https") {
            String result = "Connection to " + url.getHost() + " is secure";
            return result;
        } else {
            String result1 = "Connection to " + url.getHost() + " is not secure";
            return result1;
        }
        // END
    }
}
