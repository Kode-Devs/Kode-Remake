/**
 * The Kode Programming Language
 *
 * @author arpan
 */
module org.kodedevs.kode {
    requires info.picocli;
    requires com.install4j.runtime;

    requires transitive java.scripting;

    opens org.kodedevs.kode.api.cli to info.picocli;

    provides javax.script.ScriptEngineFactory with
            org.kodedevs.kode.api.jsr223.KodeScriptEngineFactory;
}