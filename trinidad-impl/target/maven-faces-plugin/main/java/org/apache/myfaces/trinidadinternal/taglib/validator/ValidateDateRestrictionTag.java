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

import java.text.ParseException;
import javax.faces.el.ValueBinding;
import javax.faces.validator.Validator;
import javax.faces.webapp.ValidatorTag;
import javax.servlet.jsp.JspException;
import org.apache.myfaces.trinidad.model.DateListProvider;
import org.apache.myfaces.trinidadinternal.taglib.util.TagUtils;
import org.apache.myfaces.trinidadinternal.validator.DateRestrictionValidator;

/**

 * Auto-generated tag class.
 */
public class ValidateDateRestrictionTag extends ValidatorTag
{

  /**
   * Construct an instance of the ValidateDateRestrictionTag.
   */
  public ValidateDateRestrictionTag()
  {
  }

  private String _invalidMonths;
  public void setInvalidMonths(String invalidMonths)
  {
    _invalidMonths = invalidMonths;
  }

  private String _invalidDaysOfWeek;
  public void setInvalidDaysOfWeek(String invalidDaysOfWeek)
  {
    _invalidDaysOfWeek = invalidDaysOfWeek;
  }

  private String _invalidDays;
  public void setInvalidDays(String invalidDays)
  {
    _invalidDays = invalidDays;
  }

  private String _messageDetailInvalidMonths;
  public void setMessageDetailInvalidMonths(String messageDetailInvalidMonths)
  {
    _messageDetailInvalidMonths = messageDetailInvalidMonths;
  }

  private String _messageDetailInvalidDaysOfWeek;
  public void setMessageDetailInvalidDaysOfWeek(String messageDetailInvalidDaysOfWeek)
  {
    _messageDetailInvalidDaysOfWeek = messageDetailInvalidDaysOfWeek;
  }

  private String _messageDetailInvalidDays;
  public void setMessageDetailInvalidDays(String messageDetailInvalidDays)
  {
    _messageDetailInvalidDays = messageDetailInvalidDays;
  }

  public int doStartTag() throws JspException
  {
    super.setValidatorId(DateRestrictionValidator.VALIDATOR_ID);
    return super.doStartTag();
  }

  protected Validator createValidator() throws JspException
  {
    DateRestrictionValidator validator = (DateRestrictionValidator)super.createValidator();
    _setProperties(validator);
    return validator;
  }

  private void _setProperties(
    DateRestrictionValidator validator) throws JspException
  {
    if (_invalidMonths != null)
    {
      if (TagUtils.isValueReference(_invalidMonths))
      {
        ValueBinding vb = TagUtils.getValueBinding(_invalidMonths);
        validator.setValueBinding("invalidMonths", vb);
      }
      else
      {
        try
        {
        String[] value = TagUtils.getStringArray(_invalidMonths);
        validator.setInvalidMonths(value);
        }
        catch (ParseException pe)
        {
          throw new JspException(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
    if (_invalidDaysOfWeek != null)
    {
      if (TagUtils.isValueReference(_invalidDaysOfWeek))
      {
        ValueBinding vb = TagUtils.getValueBinding(_invalidDaysOfWeek);
        validator.setValueBinding("invalidDaysOfWeek", vb);
      }
      else
      {
        try
        {
        String[] value = TagUtils.getStringArray(_invalidDaysOfWeek);
        validator.setInvalidDaysOfWeek(value);
        }
        catch (ParseException pe)
        {
          throw new JspException(
            pe.getMessage() + ": " + "Position " + pe.getErrorOffset());
        }
      }
    }
    if (_invalidDays != null)
    {
      if (TagUtils.isValueReference(_invalidDays))
      {
        ValueBinding vb = TagUtils.getValueBinding(_invalidDays);
        validator.setValueBinding("invalidDays", vb);
      }
    }
    if (_messageDetailInvalidMonths != null)
    {
      if (TagUtils.isValueReference(_messageDetailInvalidMonths))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailInvalidMonths);
        validator.setValueBinding("messageDetailInvalidMonths", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailInvalidMonths);
        validator.setMessageDetailInvalidMonths(value);
      }
    }
    if (_messageDetailInvalidDaysOfWeek != null)
    {
      if (TagUtils.isValueReference(_messageDetailInvalidDaysOfWeek))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailInvalidDaysOfWeek);
        validator.setValueBinding("messageDetailInvalidDaysOfWeek", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailInvalidDaysOfWeek);
        validator.setMessageDetailInvalidDaysOfWeek(value);
      }
    }
    if (_messageDetailInvalidDays != null)
    {
      if (TagUtils.isValueReference(_messageDetailInvalidDays))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailInvalidDays);
        validator.setValueBinding("messageDetailInvalidDays", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailInvalidDays);
        validator.setMessageDetailInvalidDays(value);
      }
    }
  }

  public void release()
  {
    super.release();
    _invalidMonths = null;
    _invalidDaysOfWeek = null;
    _invalidDays = null;
    _messageDetailInvalidMonths = null;
    _messageDetailInvalidDaysOfWeek = null;
    _messageDetailInvalidDays = null;
  }
}
