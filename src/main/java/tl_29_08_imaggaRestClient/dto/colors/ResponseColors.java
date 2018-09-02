
package tl_29_08_imaggaRestClient.dto.colors;

import java.util.List;

public class ResponseColors {

    private List<ResultColors> results;
    private List<Object> unsuccessful;

    public ResponseColors() {
    }

    public List<ResultColors> getResultsColors() {
        return results;
    }

    public List<Object> getUnsuccessful() {
        return unsuccessful;
    }
}
