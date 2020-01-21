package gov.acwi.wqp;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class StringReverseHandler extends SpringBootRequestHandler<Object, String> {

}
