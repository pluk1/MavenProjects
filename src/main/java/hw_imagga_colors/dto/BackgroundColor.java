
package hw_imagga_colors.dto;


public class BackgroundColor {

    public String b;
    public String g;
    public Float closest_palette_distance;
    public String closest_palette_color_parent;
    public String r;
    public String html_code;
    public String closest_palette_color_html_code;
    public String closest_palette_color;
    public Float percentage;

    public BackgroundColor() {
    }

    public String getB() {
        return b;
    }

    public String getG() {
        return g;
    }

    public Float getClosest_palette_distance() {
        return closest_palette_distance;
    }

    public String getClosest_palette_color_parent() {
        return closest_palette_color_parent;
    }

    public String getR() {
        return r;
    }

    public String getHtml_code() {
        return html_code;
    }

    public String getClosest_palette_color_html_code() {
        return closest_palette_color_html_code;
    }

    public String getClosest_palette_color() {
        return closest_palette_color;
    }

    public Float getPercentage() {
        return percentage;
    }
}
