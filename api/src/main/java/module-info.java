/**
 * API Implementations
 *
 * @author arpan
 * @since 2022-04-09
 */
module org.kodedevs.kode.api {
    requires info.picocli;
    requires org.fusesource.jansi;
    requires org.kodedevs.kode.common;

    opens org.kodedevs.kode.api.cli to info.picocli;
}