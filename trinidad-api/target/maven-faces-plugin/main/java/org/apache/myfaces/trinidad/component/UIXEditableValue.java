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
package org.apache.myfaces.trinidad.component;

import java.util.Iterator;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.EditableValueHolder;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.el.EvaluationException;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.faces.render.Renderer;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.logging.TrinidadLogger;
import org.apache.myfaces.trinidad.util.ComponentUtils;
import org.apache.myfaces.trinidad.util.LabeledFacesMessage;
import org.apache.myfaces.trinidad.util.MessageFactory;

/**
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>javax.faces.event.ValueChangeEvent</code></td>
 * <td valign="top" nowrap>Process Validations<br>Apply Request Values</td>
 * <td valign="top">The valueChange event is delivered when the value
                       attribute is changed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
abstract public class UIXEditableValue extends UIXValue
                                       implements EditableValueHolder
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXValue.TYPE);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);
  static public final PropertyKey VALID_KEY =
    TYPE.registerKey("valid", Boolean.class, Boolean.TRUE);
  static public final PropertyKey REQUIRED_KEY =
    TYPE.registerKey("required", Boolean.class, Boolean.FALSE);
  static public final PropertyKey LOCAL_VALUE_SET_KEY =
    TYPE.registerKey("localValueSet", Boolean.class);
  static public final PropertyKey SUBMITTED_VALUE_KEY =
    TYPE.registerKey("submittedValue");
  static public final PropertyKey VALIDATOR_KEY =
    TYPE.registerKey("validator", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey VALUE_CHANGE_LISTENER_KEY =
    TYPE.registerKey("valueChangeListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey REQUIRED_MESSAGE_DETAIL_KEY =
    TYPE.registerKey("requiredMessageDetail", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.EditableValue";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.EditableValue";
  
  static public final PropertyKey VALIDATORS_KEY =
    TYPE.registerKey("validators", Validator[].class, PropertyKey.CAP_LIST);

  static public final String REQUIRED_MESSAGE_ID =
    "org.apache.myfaces.trinidad.UIXEditableValue.REQUIRED";
  static public final String CONVERSION_MESSAGE_ID =
    "org.apache.myfaces.trinidad.UIXEditableValue.CONVERSION";



  /**
   * Convenience method to reset this component's value to an
   * uninitialized state, by resetting the local value and
   * submitted values to null (ensuring that {@link #isLocalValueSet}
   * is false), and setting "valid" to true.
   */
  public void resetValue()
  {
    setValue(null);
    setSubmittedValue(null);
    setLocalValueSet(false);
    setValid(true);
  }


  // ----------------------------------------------------- Validators Methods



  public void addValidator(Validator validator)
  {
    if (validator == null)
      throw new NullPointerException();

    getFacesBean().addEntry(VALIDATORS_KEY, validator);
  }


  public Validator[] getValidators()
  {
    return (Validator[]) getFacesBean().getEntries(VALIDATORS_KEY,
                                                   Validator.class);
  }

  public void removeValidator(Validator validator)
  {
    getFacesBean().removeEntry(VALIDATORS_KEY, validator);
  }


  /**
   */
  public void validate(FacesContext context)
  {
    if (context == null)
      throw new NullPointerException();

    // Submitted value == null means "the component was not submitted
    // at all";  validation should not continue
    Object submittedValue = getSubmittedValue();
    if (submittedValue == null)
      return;

    Object newValue = null;
    try
    {
      newValue = getConvertedValue(context, submittedValue);
    }
    catch (ConverterException ce)
    {
      _addConversionErrorMessage(context, ce, submittedValue);
      setValid(false);
    }

    validateValue(context, newValue);

    // If our value is valid, store the new value, erase the
    // "submitted" value, and emit a ValueChangeEvent if appropriate
    if (isValid())
    {
      Object previous = getValue();
      setSubmittedValue(null);
      if (compareValues(previous, newValue))
      {
        setValue(newValue);
        queueEvent(new ValueChangeEvent(this, previous, newValue));
      }
    }
  }


  /**
   * In addition to to the default
   * {@link javax.faces.component.UIComponent#broadcast}
   * processing, pass the {@link ValueChangeEvent} being broadcast to the
   * method referenced by <code>valueChangeListener</code> (if any).
   *
   * @param event {@link FacesEvent} to be broadcast
   *
   * @exception AbortProcessingException Signal the JavaServer Faces
   *  implementation that no further processing on the current event
   *  should be performed
   * @exception IllegalArgumentException if the implementation class
   *  of this {@link FacesEvent} is not supported by this component
   * @exception NullPointerException if <code>event</code> is
   * <code>null</code>
   */
  @Override
  public void broadcast(FacesEvent event)
        throws AbortProcessingException
  {
    // Perform standard superclass processing
    super.broadcast(event);

    if (event instanceof ValueChangeEvent)
    {
      broadcastToMethodBinding(event, getValueChangeListener());
    }
  }


  /**
   * In addition to the standard <code>processDecodes</code> behavior
   * inherited from {@link UIXComponentBase}, calls
   * <code>validate()</code> if the the <code>immediate</code>
   * property is true.  Iif the component is invalid afterwards or
   * a <code>RuntimeException</code> is thrown, calls
   * {@link FacesContext#renderResponse}.
   */
  @Override
  public void processDecodes(FacesContext context)
  {
    setValid(true);

    // Skip processing if our rendered flag is false
    if (!isRendered())
      return;

    super.processDecodes(context);

    if (isImmediate())
      _executeValidate(context);
  }

  @Override
  public void processUpdates(FacesContext context)
  {
    super.processUpdates(context);

    // Skip processing if our rendered flag is false
    if (!isRendered())
      return;

    // Process this component itself
    updateModel(context);

    if (!isValid())
    {
      context.renderResponse();
    }
  }

  @Override
  public void processValidators(FacesContext context)
  {
    super.processValidators(context);

    // Skip processing if our rendered flag is false
    if (!isRendered())
      return;

    if (!isImmediate())
      _executeValidate(context);
  }

  // TODO Better error messages when update model fails.
  public void updateModel(FacesContext context)
  {
    if (context == null)
      throw new NullPointerException();

    if (!isValid() || !isLocalValueSet())
      return;

    ValueBinding binding = getFacesBean().getValueBinding(VALUE_KEY);
    if (binding == null)
      return;

    try
    {
      Object localValue = getLocalValue();
      binding.setValue(context, localValue);
      setValue(null);
      setLocalValueSet(false);
      if (_LOG.isFiner())
      {
        _LOG.finer("Wrote value {0} to model {1} in component {2}",
                   new Object[]{localValue,
                                binding.getExpressionString(),
                                this});
      }
    }
    catch (RuntimeException e)
    {
      // exceptions at this point can occur during normal
      // bean attribute level validation:
      if (_LOG.isFine())
      {
        _LOG.fine("Error updating binding ({0})",
                    binding.getExpressionString());
        _LOG.fine(e);
      }

      setValid(false);
      FacesMessage message = MessageFactory.getMessage(e);
      message = _wrapMessage(message);
      context.addMessage(getClientId(context), message);
    }
  }

  /**
   */
  @SuppressWarnings("unchecked")
  protected void validateValue(FacesContext context, Object newValue)
  {
    if (!isValid())
      return;

    // If our value is empty, only check the required property
    if (isEmpty(newValue))
    {
      if (isRequired())
      {
        FacesMessage message = _getRequiredFacesMessage(context);
        context.addMessage(getClientId(context), message);
        setValid(false);
      }
    }
    // If our value is not empty, call all validators
    else
    {
      Iterator<Validator> validators = (Iterator<Validator>)getFacesBean().entries(VALIDATORS_KEY);
      while (validators.hasNext())
      {
        Validator validator = validators.next();
        try
        {
          validator.validate(context, this, newValue);
        }
        catch (ValidatorException ve)
        {
          // If the validator throws an exception, we're
          // invalid, and we need to add a message
          setValid(false);
          FacesMessage message = ve.getFacesMessage();
          if (message != null)
          {
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message = _wrapMessage(message);
            context.addMessage(getClientId(context), message);
          }
        }
      }

      MethodBinding validatorBinding = getValidator();
      if (validatorBinding != null)
      {
        try
        {
          validatorBinding.invoke(context,
                                  new Object[] { context, this, newValue});
        }
        catch (EvaluationException ee)
        {
          Throwable cause = ee.getCause();
          if (cause instanceof ValidatorException)
          {
            ValidatorException ve = (ValidatorException) cause;

            // If the validator throws an exception, we're
            // invalid, and we need to add a message
            setValid(false);
            FacesMessage message = ve.getFacesMessage();
            if (message != null)
            {
              message.setSeverity(FacesMessage.SEVERITY_ERROR);
              message = _wrapMessage(message);
              context.addMessage(getClientId(context), message);
            }
          }
          else
          {
            // Otherwise, rethrow the EvaluationException
            throw ee;
          }
        }
      }
    }
  }


  protected String getRequiredMessageKey()
  {
    return REQUIRED_MESSAGE_ID;
  }

  /**
   *
   */
  protected Object getConvertedValue(
    FacesContext context,
    Object       submittedValue) throws ConverterException
  {
    Renderer renderer = getRenderer(context);
    Object newValue = null;

    if (_LOG.isFine())
    {
      _LOG.fine("Converting from " + submittedValue + "(" +
                submittedValue.getClass() + ")");
    }

    if (renderer != null)
    {
      newValue = renderer.getConvertedValue(context, this,
                                            submittedValue);

      if (_LOG.isFine())
      {
        _LOG.fine("Renderer " + renderer + " returned value " + newValue + "(" +
                  ((newValue != null) ? newValue.getClass().getName() : "null") + ")");
      }
    }
    else if (submittedValue instanceof String)
    {
      // If there's no Renderer, and we've got a String,
      // run it through the Converter (if any)
      Converter converter = _getConverterWithType(context);
      if (converter != null)
      {
        newValue = converter.getAsObject(context, this,
                                         (String) submittedValue);
      }
      else
      {
        newValue = submittedValue;
      }
    }
    else
    {
      newValue = submittedValue;
    }

    return newValue;
  }

  /**
   * <p>Return <code>true</code> if the new value is different from the
   * previous value.</p>
   *
   * @param previous old value of this component (if any)
   * @param value new value of this component (if any)
   */
  protected boolean compareValues(Object previous, Object value)
  {
    if (isEmpty(previous)) // bug 4268807
      return !isEmpty(value);

    return !previous.equals(value);
  }

  /**
   * <p>Return <code>true</code> if the value is empty.</p>
   */
  protected boolean isEmpty(Object value)
  {
    if (value == null)
      return true;

    return ((value instanceof String) &&
            (((String) value).trim().length() == 0));
  }


  /**
   * Executes validation logic.
   */
  private void _executeValidate(FacesContext context)
  {
    try
    {
      validate(context);
    }
    catch (RuntimeException e)
    {
      context.renderResponse();
      throw e;
    }

    if (!isValid())
    {
      context.renderResponse();
    }
  }


  // We currently use 'label' for the validation failed message
  private Object _getLabel()
  {
    Object o = getAttributes().get("label");
    if (o == null)
      o = getValueBinding("label");

    return o;
  }

  private Object _getRequiredMessageDetail()
  {
    Object o = getAttributes().get("requiredMessageDetail");
      if (o == null)
       o = getValueBinding("requiredMessageDetail");

    return o;
  }

  private FacesMessage _getRequiredFacesMessage(FacesContext context)
  {
    Object customMessageDetail = _getRequiredMessageDetail();
    FacesMessage message;
    Object label = _getLabel();

    // if message is null then a custom message was not set.
    message = MessageFactory.getMessage(context,
                                        getRequiredMessageKey(),
                                        customMessageDetail,
                                        new Object[]{label},
                                        label);
    return message;
  }

  private void _addConversionErrorMessage(
     FacesContext       context,
     ConverterException ce,
     Object             value)
  {
    FacesMessage message = ce.getFacesMessage();

    if (message == null)
    {
      Object label = _getLabel();
      message = MessageFactory.getMessage(context,
                                          CONVERSION_MESSAGE_ID,
                                          new Object[]{label, value,
                                                       ce.getMessage()},
                                          label);
    }
    else
    {
      message = _wrapMessage(message);
    }

    context.addMessage(getClientId(context), message);
  }

  private Converter _getConverterWithType(FacesContext context)
  {
    Converter converter = getConverter();
    if (converter != null)
    {
      return converter;
    }

    ValueBinding valueBinding = getValueBinding("value");
    if (valueBinding == null)
    {
      return null;
    }

    Class<?> converterType = valueBinding.getType(context);
    // if converterType is null, String, or Object, assume
    // no conversion is needed
    if (converterType == null ||
        converterType == String.class ||
        converterType == Object.class)
    {
      return null;
    }

    // if getType returns a type for which we support a default
    // conversion, acquire an appropriate converter instance.
    try
    {
      Application application = context.getApplication();
      return application.createConverter(converterType);
    }
    catch (Exception e)
    {
      return null;
    }
  }

  private FacesMessage _wrapMessage(FacesMessage original)
  {
    if (original instanceof LabeledFacesMessage)
      return original;

    return new FacesMessageWrapper(original, _getLabel());
  }

  static private final TrinidadLogger _LOG =
    TrinidadLogger.createTrinidadLogger(UIXEditableValue.class);

  /**
   * Gets whether the value is converted and validated immediately in the Apply Request Values phase, or is handled in the Process Validators phase, the default.  By default, values are converted and validated together in the Process Validators phase.  However, if you need access to the value of a component during Apply Request Values - for example, if you need to get the value from an actionListener on an immediate commandButton - then setting this to "immediate" makes that possible.
   *
   * @return  the new immediate value
   */
  final public boolean isImmediate()
  {
    return ComponentUtils.resolveBoolean(getProperty(IMMEDIATE_KEY), false);
  }

  /**
   * Sets whether the value is converted and validated immediately in the Apply Request Values phase, or is handled in the Process Validators phase, the default.  By default, values are converted and validated together in the Process Validators phase.  However, if you need access to the value of a component during Apply Request Values - for example, if you need to get the value from an actionListener on an immediate commandButton - then setting this to "immediate" makes that possible.
   * 
   * @param immediate  the new immediate value
   */
  final public void setImmediate(boolean immediate)
  {
    setProperty(IMMEDIATE_KEY, immediate ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether the component's value is currently valid
   *
   * @return  the new valid value
   */
  final public boolean isValid()
  {
    return ComponentUtils.resolveBoolean(getProperty(VALID_KEY), true);
  }

  /**
   * Sets whether the component's value is currently valid
   * 
   * @param valid  the new valid value
   */
  final public void setValid(boolean valid)
  {
    setProperty(VALID_KEY, valid ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether a non-null, non-empty value must be entered.  If false, validators will not be executed when the value is null or empty.
   *
   * @return  the new required value
   */
  final public boolean isRequired()
  {
    return ComponentUtils.resolveBoolean(getProperty(REQUIRED_KEY), false);
  }

  /**
   * Sets whether a non-null, non-empty value must be entered.  If false, validators will not be executed when the value is null or empty.
   * 
   * @param required  the new required value
   */
  final public void setRequired(boolean required)
  {
    setProperty(REQUIRED_KEY, required ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether a local value is currently set.  If false, values are being retrieved from any attached ValueBinding
   *
   * @return  the new localValueSet value
   */
  final public boolean isLocalValueSet()
  {
    return ComponentUtils.resolveBoolean(getProperty(LOCAL_VALUE_SET_KEY));
  }

  /**
   * Sets whether a local value is currently set.  If false, values are being retrieved from any attached ValueBinding
   * 
   * @param localValueSet  the new localValueSet value
   */
  final public void setLocalValueSet(boolean localValueSet)
  {
    setProperty(LOCAL_VALUE_SET_KEY, localValueSet ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the current submitted value.  This value,
   * if non-null, is set by the Renderer to store a possibly invalid value
   * for later conversion or redisplay, and has not yet been converted
   * into the proper type for this component instance.   This method
   * should only be used by the decode() and validate() method
   * of this component, or its corresponding Renderer;  however, user code
   * may manually set it to null to erase any submitted value.
   *
   * @return  the new submittedValue value
   */
  final public Object getSubmittedValue()
  {
    return getProperty(SUBMITTED_VALUE_KEY);
  }

  /**
   * Sets the current submitted value.  This value,
   * if non-null, is set by the Renderer to store a possibly invalid value
   * for later conversion or redisplay, and has not yet been converted
   * into the proper type for this component instance.   This method
   * should only be used by the decode() and validate() method
   * of this component, or its corresponding Renderer;  however, user code
   * may manually set it to null to erase any submitted value.
   * 
   * @param submittedValue  the new submittedValue value
   */
  final public void setSubmittedValue(Object submittedValue)
  {
    setProperty(SUBMITTED_VALUE_KEY, (submittedValue));
  }

  /**
   * Gets a method reference to a validator method
   *
   * @return  the new validator value
   */
  final public MethodBinding getValidator()
  {
    return (MethodBinding)getProperty(VALIDATOR_KEY);
  }

  /**
   * Sets a method reference to a validator method
   * 
   * @param validator  the new validator value
   */
  final public void setValidator(MethodBinding validator)
  {
    setProperty(VALIDATOR_KEY, (validator));
  }

  /**
   * Gets a method reference to a value change listener
   *
   * @return  the new valueChangeListener value
   */
  final public MethodBinding getValueChangeListener()
  {
    return (MethodBinding)getProperty(VALUE_CHANGE_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a value change listener
   * 
   * @param valueChangeListener  the new valueChangeListener value
   */
  final public void setValueChangeListener(MethodBinding valueChangeListener)
  {
    setProperty(VALUE_CHANGE_LISTENER_KEY, (valueChangeListener));
  }

  /**
   * Gets <html> the message to be displayed, if 'required' validation fails.
   *              <p>
   *               <strong>
   *                Parameters:
   *               </strong>
   *               <ul>
   *                <li>
   *                 {0} the label that identifies the component
   *                </li>
   *               </ul>
   *              </p></html>
   *
   * @return  the new requiredMessageDetail value
   */
  final public String getRequiredMessageDetail()
  {
    return ComponentUtils.resolveString(getProperty(REQUIRED_MESSAGE_DETAIL_KEY));
  }

  /**
   * Sets <html> the message to be displayed, if 'required' validation fails.
   *              <p>
   *               <strong>
   *                Parameters:
   *               </strong>
   *               <ul>
   *                <li>
   *                 {0} the label that identifies the component
   *                </li>
   *               </ul>
   *              </p></html>
   * 
   * @param requiredMessageDetail  the new requiredMessageDetail value
   */
  final public void setRequiredMessageDetail(String requiredMessageDetail)
  {
    setProperty(REQUIRED_MESSAGE_DETAIL_KEY, (requiredMessageDetail));
  }

  /**
   * Adds a valueChange listener.
   *
   * @param listener  the valueChange listener to add
   */
  final public void addValueChangeListener(
    ValueChangeListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a valueChange listener.
   *
   * @param listener  the valueChange listener to remove
   */
  final public void removeValueChangeListener(
    ValueChangeListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached valueChange listeners.
   *
   * @return  an array of attached valueChange listeners.
   */
  final public ValueChangeListener[] getValueChangeListeners()
  {
    return (ValueChangeListener[])getFacesListeners(ValueChangeListener.class);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXEditableValue.
   */
  protected UIXEditableValue(
    String rendererType
    )
  {
    super(rendererType);
  }

  /**
   * Construct an instance of the UIXEditableValue.
   */
  protected UIXEditableValue()
  {
    this(null);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.EditableValue","org.apache.myfaces.trinidad.EditableValue");
  }
}
