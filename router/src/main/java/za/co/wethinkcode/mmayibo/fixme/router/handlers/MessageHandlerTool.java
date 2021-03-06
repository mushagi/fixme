package za.co.wethinkcode.mmayibo.fixme.router.handlers;

import io.netty.channel.Channel;
import za.co.wethinkcode.mmayibo.fixme.core.IMessageHandler;
import za.co.wethinkcode.mmayibo.fixme.core.fixprotocol.FixTags;
import za.co.wethinkcode.mmayibo.fixme.core.server.Server;

import static za.co.wethinkcode.mmayibo.fixme.core.fixprotocol.FixMessageTools.getTagValueByRegex;

public class MessageHandlerTool{
    public static IMessageHandler getMessageHandler(String rawFixmessage, Server server, Channel channel) {
        String targetComputer = getTagValueByRegex(rawFixmessage, FixTags.TARGET_COMP_ID.tag);
        String messageType = getTagValueByRegex(rawFixmessage, FixTags.MESSAGE_TYPE.tag);
        if (messageType != null && messageType.equals("800"))
            return new RegisterNetworkId(server, rawFixmessage, channel);
        return new GeneralMessageHandler(server, rawFixmessage, targetComputer, channel);
    }
}