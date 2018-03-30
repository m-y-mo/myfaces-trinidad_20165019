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
import java.util.TimeZone;
import javax.faces.convert.Converter;
import javax.faces.el.ValueBinding;
import javax.faces.webapp.ConverterTag;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidadinternal.convert.DateTimeConverter;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**

 * Auto-generated tag class.
 */
public class ConvertDateTimeTag extends ConverterTag
{

  /**
   * Construct an instance of the ConvertDateTimeTag.
   */
  public ConvertDateTimeTag()
  {
  }

  private String _messageDetailConvertDate;
  public void setMessageDetailConvertDate(String messageDetailConvertDate)
  {
    _messageDetailConvertDate = messageDetailConvertDate;
  }

  private String _messageDetailConvertTime;
  public void setMessageDetailConvertTime(String messageDetailConvertTime)
  {
    _messageDetailConvertTime = messageDetailConvertTime;
  }

  private String _messageDetailConvertBoth;
  public void setMessageDetailConvertBoth(String messageDetailConvertBoth)
  {
    _messageDetailConvertBoth = messageDetailConvertBoth;
  }

  private String _dateStyle;
  public void setDateStyle(String dateStyle)
  {
    _dateStyle = dateStyle;
  }

  private String _locale;
  public void setLocale(String locale)
  {
    _locale = locale;
  }

  private String _pattern;
  public void setPattern(String pattern)
  {
    _pattern = pattern;
  }

  private String _secondaryPattern;
  public void setSecondaryPattern(String secondaryPattern)
  {
    _secondaryPattern = secondaryPattern;
  }

  private String _timeStyle;
  public void setTimeStyle(String timeStyle)
  {
    _timeStyle = timeStyle;
  }

  private String _timeZone;
  public void setTimeZone(String timeZone)
  {
    _timeZone = timeZone;
  }

  private String _type;
  public void setType(String type)
  {
    _type = type;
  }

  @Override
  public int doStartTag() throws JspException
  {
    super.setConverterId(DateTimeConverter.CONVERTER_ID);
    return super.doStartTag();
  }

  protected Converter createConverter() throws JspException
  {
    DateTimeConverter converter = (DateTimeConverter)super.createConverter();
    _setProperties(converter);
    return converter;
  }

  private void _setProperties(
    DateTimeConverter converter) throws JspException
  {
    if (_messageDetailConvertDate != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvertDate))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvertDate);
        converter.setValueBinding("messageDetailConvertDate", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertDate);
        converter.setMessageDetailConvertDate(value);
      }
    }
    if (_messageDetailConvertTime != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvertTime))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvertTime);
        converter.setValueBinding("messageDetailConvertTime", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertTime);
        converter.setMessageDetailConvertTime(value);
      }
    }
    if (_messageDetailConvertBoth != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvertBoth))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvertBoth);
        converter.setValueBinding("messageDetailConvertBoth", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvertBoth);
        converter.setMessageDetailConvertBoth(value);
      }
    }
    if (_dateStyle != null)
    {
      if (TagUtils.isValueReference(_dateStyle))
      {
        ValueBinding vb = TagUtils.getValueBinding(_dateStyle);
        converter.setValueBinding("dateStyle", vb);
      }
      else
      {
        String value = TagUtils.getString(_dateStyle);
        converter.setDateStyle(value);
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
    if (_secondaryPattern != null)
    {
      if (TagUtils.isValueReference(_secondaryPattern))
      {
        ValueBinding vb = TagUtils.getValueBinding(_secondaryPattern);
        converter.setValueBinding("secondaryPattern", vb);
      }
      else
      {
        String value = TagUtils.getString(_secondaryPattern);
        converter.setSecondaryPattern(value);
      }
    }
    if (_timeStyle != null)
    {
      if (TagUtils.isValueReference(_timeStyle))
      {
        ValueBinding vb = TagUtils.getValueBinding(_timeStyle);
        converter.setValueBinding("timeStyle", vb);
      }
      else
      {
        String value = TagUtils.getString(_timeStyle);
        converter.setTimeStyle(value);
      }
    }
    if (_timeZone != null)
    {
      if (TagUtils.isValueReference(_timeZone))
      {
        ValueBinding vb = TagUtils.getValueBinding(_timeZone);
        converter.setValueBinding("timeZone", vb);
      }
      else
      {
        TimeZone value = TagUtils.getTimeZone(_timeZone);
        converter.setTimeZone(value);
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
    _messageDetailConvertDate = null;
    _messageDetailConvertTime = null;
    _messageDetailConvertBoth = null;
    _dateStyle = null;
    _locale = null;
    _pattern = null;
    _secondaryPattern = null;
    _timeStyle = null;
    _timeZone = null;
    _type = null;
  }
}
