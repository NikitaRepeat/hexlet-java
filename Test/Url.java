class Url {
    private String address;

    Url(String address) {
        this.address = address;
    }
    public String getProtocol() {
        String[] data = address.split("://");
        return data[0];
    }
    public String getHost() {
        String[] data = address.split("://");
        return data[1];
    }
}
// END
