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
import org.apache.myfaces.trinidadinternal.validator.LengthValidator;

/**

 * Auto-generated tag class.
 */
public class ValidateLengthTag extends ValidatorTag
{

  /**
   * Construct an instance of the ValidateLengthTag.
   */
  public ValidateLengthTag()
  {
  }

  private String _maximum;
  public void setMaximum(String maximum)
  {
    _maximum = maximum;
  }

  private String _minimum;
  public void setMinimum(String minimum)
  {
    _minimum = minimum;
  }

  private String _messageDetailMaximum;
  public void setMessageDetailMaximum(String messageDetailMaximum)
  {
    _messageDetailMaximum = messageDetailMaximum;
  }

  private String _messageDetailMinimum;
  public void setMessageDetailMinimum(String messageDetailMinimum)
  {
    _messageDetailMinimum = messageDetailMinimum;
  }

  private String _messageDetailNotInRange;
  public void setMessageDetailNotInRange(String messageDetailNotInRange)
  {
    _messageDetailNotInRange = messageDetailNotInRange;
  }

  private String _messageDetailExact;
  public void setMessageDetailExact(String messageDetailExact)
  {
    _messageDetailExact = messageDetailExact;
  }

  public int doStartTag() throws JspException
  {
    super.setValidatorId(LengthValidator.VALIDATOR_ID);
    return super.doStartTag();
  }

  protected Validator createValidator() throws JspException
  {
    LengthValidator validator = (LengthValidator)super.createValidator();
    _setProperties(validator);
    return validator;
  }

  private void _setProperties(
    LengthValidator validator) throws JspException
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
    if (_minimum != null)
    {
      if (TagUtils.isValueReference(_minimum))
      {
        ValueBinding vb = TagUtils.getValueBinding(_minimum);
        validator.setValueBinding("minimum", vb);
      }
      else
      {
        int value = TagUtils.getInteger(_minimum);
        validator.setMinimum(value);
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
    if (_messageDetailMinimum != null)
    {
      if (TagUtils.isValueReference(_messageDetailMinimum))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailMinimum);
        validator.setValueBinding("messageDetailMinimum", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailMinimum);
        validator.setMessageDetailMinimum(value);
      }
    }
    if (_messageDetailNotInRange != null)
    {
      if (TagUtils.isValueReference(_messageDetailNotInRange))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailNotInRange);
        validator.setValueBinding("messageDetailNotInRange", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailNotInRange);
        validator.setMessageDetailNotInRange(value);
      }
    }
    if (_messageDetailExact != null)
    {
      if (TagUtils.isValueReference(_messageDetailExact))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailExact);
        validator.setValueBinding("messageDetailExact", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailExact);
        validator.setMessageDetailExact(value);
      }
    }
  }

  public void release()
  {
    super.release();
    _maximum = null;
    _minimum = null;
    _messageDetailMaximum = null;
    _messageDetailMinimum = null;
    _messageDetailNotInRange = null;
    _messageDetailExact = null;
  }
}
