package com.captricity.utils;

import java.util.Map;

import com.blackbear.flatworm.ConversionOption;
import com.blackbear.flatworm.converters.CoreConverters;

/**
 * Used to defined customized Converter method
 */
public class CustomConverter extends CoreConverters {

    /**
     * Set String blank wherever null.
     */
    @Override
    public String convertChar(Object str, Map<String, ConversionOption> options) {
        return super.convertChar(str == null ? "" : str, options);
    }
}
