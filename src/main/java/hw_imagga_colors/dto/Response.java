
package hw_imagga_colors.dto;

import java.util.List;

public class Response {

    public List<Result> results;
    public List<Object> unsuccessful;

    public Response() {
    }

    public List<Result> getResults() {
        return results;
    }

    public List<Object> getUnsuccessful() {
        return unsuccessful;
    }


}
