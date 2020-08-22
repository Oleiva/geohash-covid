package geohashexample.service.realty;

import geohashexample.model.RealtyCluster;
import geohashexample.model.RealtyPriceStatistics;

import java.util.List;
import java.util.Map;

public interface RealtyService {
     void reimportRealty();

     List<RealtyCluster> findRealtyClustersWithinBounds(
            double southWestLat, double southWestLon, double northEastLat, double northEastLon,
            double zoom);

     Map<Integer, RealtyPriceStatistics> findAllRealtyPriceStatistics();
}
