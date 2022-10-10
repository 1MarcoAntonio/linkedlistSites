package itens;

public class Sites {
    private String SiteNames;
    private String SiteLinks;

    public Sites(String siteNames, String siteLinks) {
        this.SiteNames = siteNames;
        this.SiteLinks = siteLinks;
    }

    public String getSiteNames() {
        return SiteNames;
    }

    public void setSiteNames(String siteNames) {
        SiteNames = siteNames;
    }

    public String getSiteLinks() {
        return SiteLinks;
    }

    public void setSiteLinks(String siteLinks) {
        SiteLinks = siteLinks;
    }


}
