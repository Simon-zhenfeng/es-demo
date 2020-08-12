package example;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Simon
 * @date 2020/8/12 16:25
 */
@Document(indexName = "account", type = "docs", shards = 1, replicas = 0)
public class Account {
    @Id
    String id;
}
