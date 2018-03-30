// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidadinternal.taglib.convert;

import java.util.Locale;
import javax.faces.convert.Converter;
import javax.faces.el.ValueBinding;
import javax.faces.webapp.ConverterTag;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidadinternal.convert.NumberConverter;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**

 * Auto-generated tag class.
 */
public class ConvertNumberTag extends ConverterTag
{

  /**
   * Construct an instance of the ConvertNumberTag.
   */
  public ConvertNumberTag()
  {
  }

  private String _currencyCode;
  public void setCurrencyCode(String currencyCode)
  {
    _currencyCode = currencyCode;
  }

  private String _messageDetailConvertCurrency;
  public void setMessageDetailConvertCurrency(String messageDetailConvertCurrency)
  {
    _messageDetailConvertCurrency = messageDetailConvertCurrency;
  }

  private String _messageDetailConvertNumber;
  public void setMessageDetailConvertNumber(String messageDetailConvertNumber)
  {
    _messageDetailConvertNumber = messageDetailConvertNumber;
  }

  private String _messageDetailConvertPattern;
  public void setMessageDetailConvertPattern(String messageDetailConvertPattern)
  {
    _messageDetailConvertPattern = messageDetailConvertPattern;
  }

  private String _messageDetailConvertPercent;
  public void setMessageDetailConvertPercent(String messageDetailConvertPercent)
  {
    _messageDetailConvertPercent = messageDetailConvertPercent;
  }

  private String _currencySymbol;
  public void setCurrencySymbol(String currencySymbol)
  {
    _currencySymbol = currencySymbol;
  }

  private String _groupingUsed;
  public void setGroupingUsed(String groupingUsed)
  {
    _groupingUsed = groupingUsed;
  }

  private String _integerOnly;
  public void setIntegerOnly(String integerOnly)
  {
    _integerOnly = integerOnly;
  }

  private String _locale;
  public void setLocale(String locale)
  {
    _locale = locale;
  }

  private String _maxFractionDigits;
  public void setMaxFractionDigits(String maxFractionDigits)
  {
    _maxFractionDigits = maxFractionDigits;
  }

  private String _maxIntegerDigits;
  public void setMaxIntegerDigits(String maxIntegerDigits)
  {
    _maxIntegerDigits = maxIntegerDigits;
  }

  private String _minFractionDigits;
  public void setMinFractionDigits(String minFractionDigits)
  {
    _minFractionDigits = minFractionDigits;
  }

  private String _minIntegerDigits;
  public void setMinIntegerDigits(String minIntegerDigits)
  {
    _minIntegerDigits = minIntegerDigits;
  }

  private String _pattern;
  public void setPattern(String pattern)
  {
    _pattern = pattern;
  }

  private String _type;
  public void setType(String type)
  {
    _type = type;
  }

  @Override
  public int doStartTag() throws JspException
  {
    super.setConverterId(NumberConverter.CONVERTER_ID);
    return super.doStartTag();
  }

  protected Converter createConverter() throws JspException
  {
    NumberConverter converter = (NumberConverter)super.createConverter();
    _setProperties(converter);
    return converter;
  }

  private void _setProperties(
    NumberConverter converter) throws JspException
  {
    if (_currencyCode != null)
    {
      if (TagUtils.isValueReference(_currencyCode))
      {
        ValueBinding vb = TagUtils.getValueBinding(_currencyCode);
        converter.setValueBinding("currencyCode", vb);
      }
      else
      {
        String value = TagUtils.getString(_currencyCode);
        converter.setCurrencyCode(value);
      }
    }
    if (_messageDetailConvertCurrency != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvertCurrency))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvertCurrency);
        converter.setValueBinding("messageDetailConvertCurrency", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertCurrency);
        converter.setMessageDetailConvertCurrency(value);
      }
    }
    if (_messageDetailConvertNumber != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvertNumber))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvertNumber);
        converter.setValueBinding("messageDetailConvertNumber", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertNumber);
        converter.setMessageDetailConvertNumber(value);
      }
    }
    if (_messageDetailConvertPattern != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvertPattern))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvertPattern);
        converter.setValueBinding("messageDetailConvertPattern", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertPattern);
        converter.setMessageDetailConvertPattern(value);
      }
    }
    if (_messageDetailConvertPercent != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvertPercent))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvertPercent);
        converter.setValueBinding("messageDetailConvertPercent", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertPercent);
        converter.setMessageDetailConvertPercent(value);
      }
    }
    if (_currencySymbol != null)
    {
      if (TagUtils.isValueReference(_currencySymbol))
      {
        ValueBinding vb = TagUtils.getValueBinding(_currencySymbol);
        converter.setValueBinding("currencySymbol", vb);
      }
      else
      {
        String value = TagUtils.getString(_currencySymbol);
        converter.setCurrencySymbol(value);
      }
    }
    if (_groupingUsed != null)
    {
      if (TagUtils.isValueReference(_groupingUsed))
      {
        ValueBinding vb = TagUtils.getValueBinding(_groupingUsed);
        converter.setValueBinding("groupingUsed", vb);
      }
      else
      {
        boolean value = TagUtils.getBoolean(_groupingUsed);
        converter.setGroupingUsed(value);
      }
    }
    if (_integerOnly != null)
    {
      if (TagUtils.isValueReference(_integerOnly))
      {
        ValueBinding vb = TagUtils.getValueBinding(_integerOnly);
        converter.setValueBinding("integerOnly", vb);
      }
      else
      {
        boolean value = TagUtils.getBoolean(_integerOnly);
        converter.setIntegerOnly(value);
      }
    }
    if (_locale != null)
    {
      if (TagUtils.isValueReference(_locale))
      {
        ValueBinding vb = TagUtils.getValueBinding(_locale);
        converter.setValueBinding("locale", vb);
      }
      else
      {
        Locale value = TagUtils.getLocale(_locale);
        converter.setLocale(value);
      }
    }
    if (_maxFractionDigits != null)
    {
      if (TagUtils.isValueReference(_maxFractionDigits))
      {
        ValueBinding vb = TagUtils.getValueBinding(_maxFractionDigits);
        converter.setValueBinding("maxFractionDigits", vb);
      }
      else
      {
        int value = TagUtils.getInteger(_maxFractionDigits);
        converter.setMaxFractionDigits(value);
      }
    }
    if (_maxIntegerDigits != null)
    {
      if (TagUtils.isValueReference(_maxIntegerDigits))
      {
        ValueBinding vb = TagUtils.getValueBinding(_maxIntegerDigits);
        converter.setValueBinding("maxIntegerDigits", vb);
      }
      else
      {
        int value = TagUtils.getInteger(_maxIntegerDigits);
        converter.setMaxIntegerDigits(value);
      }
    }
    if (_minFractionDigits != null)
    {
      if (TagUtils.isValueReference(_minFractionDigits))
      {
        ValueBinding vb = TagUtils.getValueBinding(_minFractionDigits);
        converter.setValueBinding("minFractionDigits", vb);
      }
      else
      {
        int value = TagUtils.getInteger(_minFractionDigits);
        converter.setMinFractionDigits(value);
      }
    }
    if (_minIntegerDigits != null)
    {
      if (TagUtils.isValueReference(_minIntegerDigits))
      {
        ValueBinding vb = TagUtils.getValueBinding(_minIntegerDigits);
        converter.setValueBinding("minIntegerDigits", vb);
      }
      else
      {
        int value = TagUtils.getInteger(_minIntegerDigits);
        converter.setMinIntegerDigits(value);
      }
    }
    if (_pattern != null)
    {
      if (TagUtils.isValueReference(_pattern))
      {
        ValueBinding vb = TagUtils.getValueBinding(_pattern);
        converter.setValueBinding("pattern", vb);
      }
      else
      {
        String value = TagUtils.getString(_pattern);
        converter.setPattern(value);
      }
    }
    if (_type != null)
    {
      if (TagUtils.isValueReference(_type))
      {
        ValueBinding vb = TagUtils.getValueBinding(_type);
        converter.setValueBinding("type", vb);
      }
      else
      {
        String value = TagUtils.getString(_type);
        converter.setType(value);
      }
    }
  }

  public void release()
  {
    super.release();
    _currencyCode = null;
    _messageDetailConvertCurrency = null;
    _messageDetailConvertNumber = null;
    _messageDetailConvertPattern = null;
    _messageDetailConvertPercent = null;
    _currencySymbol = null;
    _groupingUsed = null;
    _integerOnly = null;
    _locale = null;
    _maxFractionDigits = null;
    _maxIntegerDigits = null;
    _minFractionDigits = null;
    _minIntegerDigits = null;
    _pattern = null;
    _type = null;
  }
}
