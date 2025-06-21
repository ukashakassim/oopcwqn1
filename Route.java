package support;

public class Route {
    private final String routeId;
    private final String startPoint;
    private final String endPoint;
    private final String schedule;

    public Route(String routeId, String startPoint, String endPoint, String schedule) {
        this.routeId = routeId;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.schedule = schedule;
    }

    public String getRouteId() { return routeId; }
    public String getStartPoint() { return startPoint; }
    public String getEndPoint() { return endPoint; }
    public String getSchedule() { return schedule; }
}