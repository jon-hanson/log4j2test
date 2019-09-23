import org.apache.logging.log4j.*;

class Log4j2Test {
    private static final Logger logger = LogManager.getLogger(Log4j2Test.class);

    public static void main(String[] args) {
        // generate some logging output.
        System.getenv()
                .forEach((k, v) -> logger.info(k + "=" + v));
    }
}
