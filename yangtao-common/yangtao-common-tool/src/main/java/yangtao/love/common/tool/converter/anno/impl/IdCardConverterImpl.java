package yangtao.love.common.tool.converter.anno.impl;

import yangtao.love.common.tool.converter.base.BaseConverter;

/**
 * 身份证转换器 保留前4位及后4位
 *
 * @author loser
 * @date 2023/07/22 10:40
 */
public class IdCardConverterImpl extends BaseConverter<String, String> {

    @Override
    protected String doConvert(String value) {
        return value.replaceAll("(\\d{4})\\d*([0-9a-zA-Z]{4})", "$1******$2");
    }

}
