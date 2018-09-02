
package tl_29_08_imaggaRestClient.dto.colors;


public class ImageColor {

    private String b;
    private String g;
    private Float percent;
    private String closestPaletteColorParent;
    private String r;
    private String html_code;
    private String closestPaletteColorhtml_code;
    private String closestPaletteColor;
    private Float closestPaletteDistance;

    public ImageColor() {
    }

    public String getB() {
        return b;
    }

    public String getG() {
        return g;
    }

    public Float getPercent() {
        return percent;
    }

    public String getClosestPaletteColorParent() {
        return closestPaletteColorParent;
    }

    public String getR() {
        return r;
    }

    public String gethtml_code() {
        return html_code;
    }

    public String getClosestPaletteColorhtml_code() {
        return closestPaletteColorhtml_code;
    }

    public String getClosestPaletteColor() {
        return closestPaletteColor;
    }

    public Float getClosestPaletteDistance() {
        return closestPaletteDistance;
    }
}
