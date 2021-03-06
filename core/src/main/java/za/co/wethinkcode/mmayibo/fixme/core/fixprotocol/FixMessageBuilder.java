package za.co.wethinkcode.mmayibo.fixme.core.fixprotocol;

import lombok.Getter;

import java.util.HashMap;

import static za.co.wethinkcode.mmayibo.fixme.core.fixprotocol.FixTags.*;

public class FixMessageBuilder {
    @Getter
    private  FixMessage fixMessage;
    private  HashMap<Integer, Object> tagsValuesMap;

    public FixMessageBuilder existingMessage(FixMessage fixMessage) {
        this.fixMessage = fixMessage;
        tagsValuesMap = fixMessage.getTagsValuesMap();
        return this;
    }

    public FixMessageBuilder newFixMessage() {
         fixMessage= new FixMessage();
         tagsValuesMap = fixMessage.getTagsValuesMap();
         return this;
    }
    public FixMessageBuilder withMessageType(String value) {
        fixMessage.messageType = value;
        tagsValuesMap.put(MESSAGE_TYPE.tag, value);
        return  this;
    }

    public FixMessageBuilder withSenderCompId(String value) {
        fixMessage.senderCompId = value;
        tagsValuesMap.put(SENDER_COMP_ID.tag, value);
        return  this;
    }

    public FixMessageBuilder withTargetCompId(String value) {
        fixMessage.targetCompId = value;
        tagsValuesMap.put(TARGET_COMP_ID.tag, value);
        return  this;
    }

    public FixMessageBuilder withOrderQuantity(int value) {
        fixMessage.orderQuantity = value;
        tagsValuesMap.put(ORDER_QUANTITY.tag, value);
        return  this;
    }

    public FixMessageBuilder withClOrderId(String value) {
        fixMessage.clOrderId = value;
        tagsValuesMap.put(CL_ORDER_ID.tag, value);
        return  this;
    }

    public FixMessageBuilder withSide(String value) {
        fixMessage.side = value;
        tagsValuesMap.put(SIDE.tag, value);
        return  this;
    }

    public FixMessageBuilder withPrice(double value) {
        fixMessage.price = value;
        tagsValuesMap.put(PRICE.tag, value);
        return  this;
    }

    public FixMessageBuilder withText(String value) {
        fixMessage.text = value;
        tagsValuesMap.put(TEXT.tag, value);
        return this;
    }

    public FixMessageBuilder withMDReqID(String value) {
        fixMessage.mDReqID = value;
        tagsValuesMap.put(MD_REQ_ID.tag, value);
        return this;
    }


    public FixMessageBuilder withMDName(String value) {
        fixMessage.mdName = value;
        tagsValuesMap.put(MD_NAME.tag, value);
        return this;
    }

    public FixMessageBuilder withSymbol(String value) {
        fixMessage.symbol = value;
        tagsValuesMap.put(SYMBOL.tag, value);
        return this;
    }

    public FixMessageBuilder withClientIId(String value) {
        fixMessage.clientId = value;
        tagsValuesMap.put(CLIENTID.tag, value);
        return this;
    }

    public FixMessageBuilder withOrdStatus(String value) {
        fixMessage.ordStatus = value;
        tagsValuesMap.put(ORD_STATUS.tag, value);
        return this;
    }

    public FixMessageBuilder withMessageId(String value) {
        fixMessage.messageId = value;
        tagsValuesMap.put(MSG_ID.tag, value);
        return this;
    }

    public FixMessageBuilder withTestReqId(String value) {
        fixMessage.testReqId = value;
        tagsValuesMap.put(TEST_REQ_ID.tag, value);
        return this;
    }
    public FixMessageBuilder withDelay(int value) {
        fixMessage.delay = value;
        tagsValuesMap.put(DELAY.tag, value);
        return this;
    }
}
