package batch.guide.book.Chapter07;
/* 2025.04.15 PM 3:38 updated
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import batch.guide.book.Chapter07.batch.CustomerItemListener;
import batch.guide.book.Chapter07.batch.CustomerItemReader;
import batch.guide.book.Chapter07.domain.Customer;

@EnableBatchProcessing
@SpringBootApplication
public class CustomInputJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Bean
	public ItemWriter<Customer> itemWriter() {
		return (items) -> items.forEach(System.out::println);
	}

	@Bean
	public Step copyFileStep() {
		return this.stepBuilderFactory.get("copyFileStep")
				.<Customer, Customer>chunk(10)
				.reader(customerItemReader())
				.writer(itemWriter())
				.listener(new CustomerItemListener())
				.build();
	}

	@Bean
	public Job job() {
		return this.jobBuilderFactory.get("job")
				.start(copyFileStep())
				.build();
	}


	public static void main(String[] args) {

		SpringApplication.run(CustomInputJob.class, args);
	}

}
*/
