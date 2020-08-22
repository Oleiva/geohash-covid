package geohashexample;

public class Variables {
    public static final String REALTY_PRICE_STDDEV_CACHE_NAME = "realty-price-stddev";

    private static final int FIRST_ZOOM = 4;
    private static final int LAST_ZOOM = 22;
    public static final int GEOHASH_PRECISION = 10;




    public static int getFirstZoom() {
        return FIRST_ZOOM;
    }

    public static int getLastZoom() {
        return LAST_ZOOM;
    }

    public static String getRealtyPriceStddevCacheName() {
        return REALTY_PRICE_STDDEV_CACHE_NAME;
    }


}
