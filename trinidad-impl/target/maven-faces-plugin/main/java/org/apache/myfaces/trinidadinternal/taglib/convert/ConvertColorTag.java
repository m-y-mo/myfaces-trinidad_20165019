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

import java.text.ParseException;
import javax.faces.convert.Converter;
import javax.faces.el.ValueBinding;
import javax.faces.webapp.ConverterTag;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidadinternal.convert.ColorConverter;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;

/**

 * Auto-generated tag class.
 */
public class ConvertColorTag extends ConverterTag
{

  /**
   * Construct an instance of the ConvertColorTag.
   */
  public ConvertColorTag()
  {
  }

  private String _patterns;
  public void setPatterns(String patterns)
  {
    _patterns = patterns;
  }

  private String _transparentAllowed;
  public void setTransparentAllowed(String transparentAllowed)
  {
    _transparentAllowed = transparentAllowed;
  }

  private String _messageDetailConvert;
  public void setMessageDetailConvert(String messageDetailConvert)
  {
    _messageDetailConvert = messageDetailConvert;
  }

  @Override
  public int doStartTag() throws JspException
  {
    super.setConverterId(ColorConverter.CONVERTER_ID);
    return super.doStartTag();
  }

  protected Converter createConverter() throws JspException
  {
    ColorConverter converter = (ColorConverter)super.createConverter();
    _setProperties(converter);
    return converter;
  }

  private void _setProperties(
    ColorConverter converter) throws JspException
  {
    if (_patterns != null)
    {
      if (TagUtils.isValueReference(_patterns))
      {
        ValueBinding vb = TagUtils.getValueBinding(_patterns);
        converter.setValueBinding("patterns", vb);
      }
      else
      {
        try
        {
        String[] value = TagUtils.getStringArray(_patterns);
        converter.setPatterns(value);
        }
        catch (ParseException pe)
        {
          throw new JspException(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
    if (_transparentAllowed != null)
    {
      if (TagUtils.isValueReference(_transparentAllowed))
      {
        ValueBinding vb = TagUtils.getValueBinding(_transparentAllowed);
        converter.setValueBinding("transparentAllowed", vb);
      }
      else
      {
        boolean value = TagUtils.getBoolean(_transparentAllowed);
        converter.setTransparentAllowed(value);
      }
    }
    if (_messageDetailConvert != null)
    {
      if (TagUtils.isValueReference(_messageDetailConvert))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailConvert);
        converter.setValueBinding("messageDetailConvert", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailConvert);
        converter.setMessageDetailConvert(value);
      }
    }
  }

  public void release()
  {
    super.release();
    _patterns = null;
    _transparentAllowed = null;
    _messageDetailConvert = null;
  }
}
