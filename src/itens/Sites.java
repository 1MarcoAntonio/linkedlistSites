package itens;

public class Sites {
    private String siteNames;
    private String siteLinks;

    public Sites(String siteNames, String siteLinks) {
        this.siteNames = siteNames;
        this.siteLinks = siteLinks;
    }

    public Sites(String siteNames) {
        this.siteNames = siteNames;
    }

    public String getSiteNames() {
        return siteNames;
    }

    public void setSiteNames(String siteNames) {
        this.siteNames = siteNames;
    }

    public String getSiteLinks() {
        return siteLinks;
    }

    public void setSiteLinks(String siteLinks) {
        this.siteLinks = siteLinks;
    }


}
