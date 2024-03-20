package co.kr.kafkaconsumer1.listener;

import co.kr.kafkaconsumer1.common.constant.KafkaConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumerListeners {

    @KafkaListener(topics = KafkaConstant.DEFAULT_TOPIC
                    , groupId = KafkaConstant.DEFAULT_CONSUMER_GROUP
                    , containerFactory = "kafkaListenerContainerFactory")
    public void getSongTopic(@Headers MessageHeaders messageHeaders
                                  ,ConsumerRecord<String,Object> record, Acknowledgment acknowledgment) throws Exception{
        log.info("[songTopicListener] START, record: {}", record.value());
        log.info("messageHeaders ::: {}", messageHeaders.toString());

        //TODO 필요한 로직 추가

        acknowledgment.acknowledge();
        log.info("[songTopicListener] END");
    }

}
