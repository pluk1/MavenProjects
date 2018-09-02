
package tl_29_08_imaggaRestClient.dto.colors;

import java.util.List;

public class Info {

    private List<BackgroundColor> backgroundColors;
    private String colorVariance;
    private String objectPercentage;
    private List<ImageColor> imageColors;
    private Float colorPercentThreshold;
    private List<ForegroundColor> foregroundColors;

    public Info() {
    }

    public List<BackgroundColor> getBackgroundColors() {
        return backgroundColors;
    }

    public String getColorVariance() {
        return colorVariance;
    }

    public String getObjectPercentage() {
        return objectPercentage;
    }

    public List<ImageColor> getImageColors() {
        return imageColors;
    }

    public Float getColorPercentThreshold() {
        return colorPercentThreshold;
    }

    public List<ForegroundColor> getForegroundColors() {
        return foregroundColors;
    }
}
