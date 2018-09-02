
package hw_imagga_colors.dto;

import java.util.List;

public class Info {

    public List<BackgroundColor> background_colors;
    public String color_variance;
    public String object_percentage;
    public List<ImageColor> image_colors;
    public Float color_percent_threshold;
    public List<ForegroundColor> foreground_colors;

    public Info() {
    }

    public List<BackgroundColor> getBackground_colors() {
        return background_colors;
    }

    public String getColor_variance() {
        return color_variance;
    }

    public String getObject_percentage() {
        return object_percentage;
    }

    public List<ImageColor> getImage_colors() {
        return image_colors;
    }

    public Float getColor_percent_threshold() {
        return color_percent_threshold;
    }

    public List<ForegroundColor> getForeground_colors() {
        return foreground_colors;
    }
}
