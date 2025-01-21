package telran.probes;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class AnalyzerAppl {
	
	@Value("${app.analyzer.producer.binding.name}")
	String producerBindingName;
	
	@Bean
	Consumer<ProbeData> analyzerConsumer(){
		return probeData ->{
			log.trace("received probe: {}", probeData);
			//TODO
			log.debug("deviation: {}");
			//TODO
			log.debug("deviation data {} send to {}");
		};
	}
	

	public static void main(String[] args) {
		SpringApplication.run(AnalyzerAppl.class, args);

	}

}
