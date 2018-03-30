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
package org.apache.myfaces.trinidadinternal.taglib.validator;

import javax.faces.el.ValueBinding;
import javax.faces.validator.Validator;
import javax.faces.webapp.ValidatorTag;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;
import org.apache.myfaces.trinidadinternal.validator.ByteLengthValidator;

/**

 * Auto-generated tag class.
 */
public class ValidateByteLengthTag extends ValidatorTag
{

  /**
   * Construct an instance of the ValidateByteLengthTag.
   */
  public ValidateByteLengthTag()
  {
  }

  private String _maximum;
  public void setMaximum(String maximum)
  {
    _maximum = maximum;
  }

  private String _encoding;
  public void setEncoding(String encoding)
  {
    _encoding = encoding;
  }

  private String _messageDetailMaximum;
  public void setMessageDetailMaximum(String messageDetailMaximum)
  {
    _messageDetailMaximum = messageDetailMaximum;
  }

  public int doStartTag() throws JspException
  {
    super.setValidatorId(ByteLengthValidator.VALIDATOR_ID);
    return super.doStartTag();
  }

  protected Validator createValidator() throws JspException
  {
    ByteLengthValidator validator = (ByteLengthValidator)super.createValidator();
    _setProperties(validator);
    return validator;
  }

  private void _setProperties(
    ByteLengthValidator validator) throws JspException
  {
    if (_maximum != null)
    {
      if (TagUtils.isValueReference(_maximum))
      {
        ValueBinding vb = TagUtils.getValueBinding(_maximum);
        validator.setValueBinding("maximum", vb);
      }
      else
      {
        int value = TagUtils.getInteger(_maximum);
        validator.setMaximum(value);
      }
    }
    if (_encoding != null)
    {
      if (TagUtils.isValueReference(_encoding))
      {
        ValueBinding vb = TagUtils.getValueBinding(_encoding);
        validator.setValueBinding("encoding", vb);
      }
      else
      {
        String value = TagUtils.getString(_encoding);
        validator.setEncoding(value);
      }
    }
    if (_messageDetailMaximum != null)
    {
      if (TagUtils.isValueReference(_messageDetailMaximum))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailMaximum);
        validator.setValueBinding("messageDetailMaximum", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailMaximum);
        validator.setMessageDetailMaximum(value);
      }
    }
  }

  public void release()
  {
    super.release();
    _maximum = null;
    _encoding = null;
    _messageDetailMaximum = null;
  }
}
