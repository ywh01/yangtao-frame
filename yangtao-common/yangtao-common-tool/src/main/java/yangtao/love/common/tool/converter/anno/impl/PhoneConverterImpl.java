package yangtao.love.common.tool.converter.anno.impl;

import yangtao.love.common.tool.converter.base.BaseConverter;

/**
 * 隐藏手机号码
 *
 * @author loser
 * @date 2023/07/22 10:40
 */
public class PhoneConverterImpl extends BaseConverter<String, String> {

    @Override
    protected String doConvert(String value) {
        return value.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

}
