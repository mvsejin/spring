package batch.guide.book.Chapter07;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * To load the data for this job into MongoDB, unzip the zip file src/main/resources/input/tweets.zip.  Then execute
 * the following command:
 * <code>mongorestore -d tweets -c tweets_collection &lt;PATH_TO_UNZIPED_DIR&gt;/dump\ 2/twitter/tweets.bson</code>
 */
@EnableBatchProcessing
@SpringBootApplication
public class MongoDbJob {
//
//	@Autowired
//	private JobBuilderFactory jobBuilderFactory;
//
//	@Autowired
//	private StepBuilderFactory stepBuilderFactory;
//
//
//	@Bean
//	public Job job() {
//		return this.jobBuilderFactory.get("job")
//				.start(copyFileStep())
//				.build();
//	}
//
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(MongoDbJob.class, "hashTag=nodejs");
//	}

}

