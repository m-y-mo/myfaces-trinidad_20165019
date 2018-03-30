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
import org.apache.myfaces.trinidadinternal.validator.RegExpValidator;

/**

 * Auto-generated tag class.
 */
public class ValidateRegExpTag extends ValidatorTag
{

  /**
   * Construct an instance of the ValidateRegExpTag.
   */
  public ValidateRegExpTag()
  {
  }

  private String _pattern;
  public void setPattern(String pattern)
  {
    _pattern = pattern;
  }

  private String _messageDetailNoMatch;
  public void setMessageDetailNoMatch(String messageDetailNoMatch)
  {
    _messageDetailNoMatch = messageDetailNoMatch;
  }

  public int doStartTag() throws JspException
  {
    super.setValidatorId(RegExpValidator.VALIDATOR_ID);
    return super.doStartTag();
  }

  protected Validator createValidator() throws JspException
  {
    RegExpValidator validator = (RegExpValidator)super.createValidator();
    _setProperties(validator);
    return validator;
  }

  private void _setProperties(
    RegExpValidator validator) throws JspException
  {
    if (_pattern != null)
    {
      if (TagUtils.isValueReference(_pattern))
      {
        ValueBinding vb = TagUtils.getValueBinding(_pattern);
        validator.setValueBinding("pattern", vb);
      }
      else
      {
        String value = TagUtils.getString(_pattern);
        validator.setPattern(value);
      }
    }
    if (_messageDetailNoMatch != null)
    {
      if (TagUtils.isValueReference(_messageDetailNoMatch))
      {
        ValueBinding vb = TagUtils.getValueBinding(_messageDetailNoMatch);
        validator.setValueBinding("messageDetailNoMatch", vb);
      }
      else
      {
        String value = TagUtils.getString(_messageDetailNoMatch);
        validator.setMessageDetailNoMatch(value);
      }
    }
  }

  public void release()
  {
    super.release();
    _pattern = null;
    _messageDetailNoMatch = null;
  }
}
