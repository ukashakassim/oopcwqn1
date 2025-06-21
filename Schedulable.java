package interfaces;

import support.Route;

public interface Schedulable {
    void assignRoute(Route route);
    String getSchedule();
}