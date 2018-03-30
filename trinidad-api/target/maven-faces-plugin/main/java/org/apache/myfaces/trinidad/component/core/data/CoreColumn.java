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
package org.apache.myfaces.trinidad.component.core.data;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXColumn;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <P>
 *             The immediate children of a Table component must all be
 *             <code>&lt;tr:column&gt;</code> components. Each visible Trinidad Column
 *             component creates a separate column in the Table.
 *           </P>
 *           <P>
 *             Use the &quot;header&quot; facet on a Column to create the column header.
 *             The following example creates a two-column table with the column headers -
 *             &quot;Firstname&quot; and &quot;Lastname&quot;:
 *           </P>
 *           <pre>
 *   <tr:table>
 *     <tr:column>
 *       <f:facet name="header">
 *         <tr:outputText value="Firstname"/>
 *       </f:facet>
 *       ...
 *     </tr:column>
 *     <tr:column>
 *       <f:facet name="header">
 *         <tr:outputText value="Lastname"/>
 *       </f:facet>
 *       ...
 *     </tr:column>
 *   </tr:table>
 *           </pre>
 *           <P>
 *             The child components of each Column display the data for each row in
 *             that column. The Column does not create child components per row;
 *             instead, each child is repeatedly rendered (stamped) once per
 *             row. Because of this stamping behavior, only certain types of
 *             components are supported as children inside a Column. Supported
 *             components include all components with no behavior and most
 *             components that implement the EditableValueHolder or ActionSource
 *             interfaces.
 *           </P>
 *           <P>
 *             As each row is stamped, the data for the current row ( see
 *             <code>getRowData()</code> on the Table)
 *             is copied into an EL reachable property.
 *             The name of this property is defined by the <code>var</code>
 *             property on the Table. Once the Table has completed rendering, this
 *             property is removed (or reverted back to its previous value). In
 *             the following example, the data for each row is placed under the EL
 *             property &quot;row&quot;. Each Column displays the data for each row by getting
 *             further properties from the &quot;row&quot; property:
 *           </P>
 *           <pre>
 *   <tr:table var="row" value="#{myBean.employees}">
 *     <tr:column>
 *       <tr:outputText value="#{row.firstname}"/>
 *     </tr:column>
 *     <tr:column>
 *       tr:outputText value="#{row.lastname}"/>
 *     </tr:column>
 *   </tr:table>
 *           </pre>
 * 
 *           <section name="Formatting">
 *             <p>
 *               The Column component supports the following attributes related to
 *               formatting:
 *               <dl>
 *                 <dt>align</dt>
 * 
 *                 <dd>The type of alignment to use for this column. This
 *                 atribute controls left/start, right/end, or center justification of the
 *                 column data.
 *                 </dd>
 * 
 *                 <dt>width</dt>
 *                 <dd>The width of this column.
 *                 </dd>
 * 
 *                 <dt>noWrap</dt>
 *                 <dd>Controls whether long lines of text in the column data should
 *                 be wrapped.</dd>
 * 
 *                 <dt>headerNoWrap</dt>
 *                 <dd>Controls whether long lines of text in the column header should
 *                   be wrapped.</dd>
 * 
 *                 <dt>separateRows</dt> <dd>Controls whether each child of this
 *                 column should be rendered in separate cells, or inside the same
 *                 cell.</dd>
 *               </dl>
 *             </p>
 *           </section>
 * 
 *           <section name="Sorting">
 *             <P>
 *               In order to make this Column sortable, set the &quot;sortable&quot;
 *               property to true and set &quot;sortProperty&quot; to the name of the
 *               model that this column will sort.  Sorting can be programatically
 *               turned on with the <code>setSortCritiera()</code> method on the\
 *               table.
 *             </P>
 *           </section>
 * 
 *           <section name="Column Groups">
 *             <P>
 *               <code>&lt;tr:column&gt; </code> tags can be nested to produce
 *               groups of columns. The header of a column group spans across
 *               all the columns it contains. The following example creates
 *               a column group that has the header &quot;Name&quot; and contains
 *               two sub columns with headers &quot;First&quot; and &quot;Last&quot;:
 *             </P>
 *           <pre>
 *   <tr:table var="row" value="#{myBean.employees}">
 *     <tr:column>
 *       <f:facet name="header">
 *         <tr:outputText value="Name"/>
 *       </f:facet>
 *       <tr:column>
 *         <f:facet name="header">
 *           <tr:outputText value="First"/>
 *         </f:facet>
 *         <tr:outputText value="#{row.firstname}"/>
 *       </tr:column>
 *       <tr:column>
 *         <f:facet name="header">
 *           <tr:outputText value="Last"/>
 *         </f:facet>
 *         tr:outputText value="#{row.lastname}"/>
 *       </tr:column>
 *     </tr:column>
 *   </tr:table>
 *           </pre>
 *           </section>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreColumn extends UIXColumn
{
  static public final String ALIGN_START = "start";
  static public final String ALIGN_END = "end";
  static public final String ALIGN_CENTER = "center";
  static public final String ALIGN_LEFT = "left";
  static public final String ALIGN_RIGHT = "right";
  static public final String DEFAULT_SORT_ORDER_ASCENDING = "ascending";
  static public final String DEFAULT_SORT_ORDER_DESCENDING = "descending";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXColumn.TYPE);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey ONCLICK_KEY =
    TYPE.registerKey("onclick", String.class);
  static public final PropertyKey ONDBLCLICK_KEY =
    TYPE.registerKey("ondblclick", String.class);
  static public final PropertyKey ONMOUSEDOWN_KEY =
    TYPE.registerKey("onmousedown", String.class);
  static public final PropertyKey ONMOUSEUP_KEY =
    TYPE.registerKey("onmouseup", String.class);
  static public final PropertyKey ONMOUSEOVER_KEY =
    TYPE.registerKey("onmouseover", String.class);
  static public final PropertyKey ONMOUSEMOVE_KEY =
    TYPE.registerKey("onmousemove", String.class);
  static public final PropertyKey ONMOUSEOUT_KEY =
    TYPE.registerKey("onmouseout", String.class);
  static public final PropertyKey ONKEYPRESS_KEY =
    TYPE.registerKey("onkeypress", String.class);
  static public final PropertyKey ONKEYDOWN_KEY =
    TYPE.registerKey("onkeydown", String.class);
  static public final PropertyKey ONKEYUP_KEY =
    TYPE.registerKey("onkeyup", String.class);
  static public final PropertyKey ALIGN_KEY =
    TYPE.registerKey("align", String.class, "start");
  static public final PropertyKey DEFAULT_SORT_ORDER_KEY =
    TYPE.registerKey("defaultSortOrder", String.class, "ascending");
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", String.class);
  static public final PropertyKey HEADER_TEXT_KEY =
    TYPE.registerKey("headerText", String.class);
  static public final PropertyKey NO_WRAP_KEY =
    TYPE.registerKey("noWrap", Boolean.class, Boolean.FALSE);
  static public final PropertyKey HEADER_NO_WRAP_KEY =
    TYPE.registerKey("headerNoWrap", Boolean.class, Boolean.FALSE);
  static public final PropertyKey SORTABLE_KEY =
    TYPE.registerKey("sortable", Boolean.class, Boolean.FALSE);
  static public final PropertyKey SEPARATE_ROWS_KEY =
    TYPE.registerKey("separateRows", Boolean.class, Boolean.FALSE);
  static public final PropertyKey ROW_HEADER_KEY =
    TYPE.registerKey("rowHeader", Boolean.class, Boolean.FALSE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Column";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreColumn";

  /**
   * Construct an instance of the CoreColumn.
   */
  public CoreColumn()
  {
    super("org.apache.myfaces.trinidad.Column");
  }

  /**
   * Gets the CSS styles to use for this component.
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the CSS styles to use for this component.
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
  }

  /**
   * Gets a CSS style class to use for this component.
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets a CSS style class to use for this component.
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
  }

  /**
   * Gets an onclick Javascript handler.
   *
   * @return  the new onclick value
   */
  final public String getOnclick()
  {
    return ComponentUtils.resolveString(getProperty(ONCLICK_KEY));
  }

  /**
   * Sets an onclick Javascript handler.
   * 
   * @param onclick  the new onclick value
   */
  final public void setOnclick(String onclick)
  {
    setProperty(ONCLICK_KEY, (onclick));
  }

  /**
   * Gets an ondblclick Javascript handler.
   *
   * @return  the new ondblclick value
   */
  final public String getOndblclick()
  {
    return ComponentUtils.resolveString(getProperty(ONDBLCLICK_KEY));
  }

  /**
   * Sets an ondblclick Javascript handler.
   * 
   * @param ondblclick  the new ondblclick value
   */
  final public void setOndblclick(String ondblclick)
  {
    setProperty(ONDBLCLICK_KEY, (ondblclick));
  }

  /**
   * Gets an onmousedown Javascript handler.
   *
   * @return  the new onmousedown value
   */
  final public String getOnmousedown()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEDOWN_KEY));
  }

  /**
   * Sets an onmousedown Javascript handler.
   * 
   * @param onmousedown  the new onmousedown value
   */
  final public void setOnmousedown(String onmousedown)
  {
    setProperty(ONMOUSEDOWN_KEY, (onmousedown));
  }

  /**
   * Gets an onmouseup Javascript handler.
   *
   * @return  the new onmouseup value
   */
  final public String getOnmouseup()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEUP_KEY));
  }

  /**
   * Sets an onmouseup Javascript handler.
   * 
   * @param onmouseup  the new onmouseup value
   */
  final public void setOnmouseup(String onmouseup)
  {
    setProperty(ONMOUSEUP_KEY, (onmouseup));
  }

  /**
   * Gets an onmouseover Javascript handler.
   *
   * @return  the new onmouseover value
   */
  final public String getOnmouseover()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOVER_KEY));
  }

  /**
   * Sets an onmouseover Javascript handler.
   * 
   * @param onmouseover  the new onmouseover value
   */
  final public void setOnmouseover(String onmouseover)
  {
    setProperty(ONMOUSEOVER_KEY, (onmouseover));
  }

  /**
   * Gets an onmousemove Javascript handler.
   *
   * @return  the new onmousemove value
   */
  final public String getOnmousemove()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEMOVE_KEY));
  }

  /**
   * Sets an onmousemove Javascript handler.
   * 
   * @param onmousemove  the new onmousemove value
   */
  final public void setOnmousemove(String onmousemove)
  {
    setProperty(ONMOUSEMOVE_KEY, (onmousemove));
  }

  /**
   * Gets an onmouseout Javascript handler.
   *
   * @return  the new onmouseout value
   */
  final public String getOnmouseout()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOUT_KEY));
  }

  /**
   * Sets an onmouseout Javascript handler.
   * 
   * @param onmouseout  the new onmouseout value
   */
  final public void setOnmouseout(String onmouseout)
  {
    setProperty(ONMOUSEOUT_KEY, (onmouseout));
  }

  /**
   * Gets an onkeypress Javascript handler.
   *
   * @return  the new onkeypress value
   */
  final public String getOnkeypress()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYPRESS_KEY));
  }

  /**
   * Sets an onkeypress Javascript handler.
   * 
   * @param onkeypress  the new onkeypress value
   */
  final public void setOnkeypress(String onkeypress)
  {
    setProperty(ONKEYPRESS_KEY, (onkeypress));
  }

  /**
   * Gets an onkeydown Javascript handler.
   *
   * @return  the new onkeydown value
   */
  final public String getOnkeydown()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYDOWN_KEY));
  }

  /**
   * Sets an onkeydown Javascript handler.
   * 
   * @param onkeydown  the new onkeydown value
   */
  final public void setOnkeydown(String onkeydown)
  {
    setProperty(ONKEYDOWN_KEY, (onkeydown));
  }

  /**
   * Gets an onkeyup Javascript handler.
   *
   * @return  the new onkeyup value
   */
  final public String getOnkeyup()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYUP_KEY));
  }

  /**
   * Sets an onkeyup Javascript handler.
   * 
   * @param onkeyup  the new onkeyup value
   */
  final public void setOnkeyup(String onkeyup)
  {
    setProperty(ONKEYUP_KEY, (onkeyup));
  }

  /**
   * Gets The alignment for this column. The legal values are "start", "end" and "center", for left-justified, right-justified, and center-justified respectively in LTR display. The default value is "start".
   *
   * @return  the new align value
   */
  final public String getAlign()
  {
    return ComponentUtils.resolveString(getProperty(ALIGN_KEY), "start");
  }

  /**
   * Sets The alignment for this column. The legal values are "start", "end" and "center", for left-justified, right-justified, and center-justified respectively in LTR display. The default value is "start".
   * 
   * @param align  the new align value
   */
  final public void setAlign(String align)
  {
    setProperty(ALIGN_KEY, (align));
  }

  /**
   * Gets The default sort order of the column. The legal values are "ascending" or "descending" for ascending sorting or descending sorting on a first click respectively. The default value is "ascending".
   *
   * @return  the new defaultSortOrder value
   */
  final public String getDefaultSortOrder()
  {
    return ComponentUtils.resolveString(getProperty(DEFAULT_SORT_ORDER_KEY), "ascending");
  }

  /**
   * Sets The default sort order of the column. The legal values are "ascending" or "descending" for ascending sorting or descending sorting on a first click respectively. The default value is "ascending".
   * 
   * @param defaultSortOrder  the new defaultSortOrder value
   */
  final public void setDefaultSortOrder(String defaultSortOrder)
  {
    setProperty(DEFAULT_SORT_ORDER_KEY, (defaultSortOrder));
  }

  /**
   * Gets the preferred width of this column, e.g., "30%", "100px".
   *
   * @return  the new width value
   */
  final public String getWidth()
  {
    return ComponentUtils.resolveString(getProperty(WIDTH_KEY));
  }

  /**
   * Sets the preferred width of this column, e.g., "30%", "100px".
   * 
   * @param width  the new width value
   */
  final public void setWidth(String width)
  {
    setProperty(WIDTH_KEY, (width));
  }

  /**
   * Gets text to display in the header of the column.  This is a convenience that generates output equivalent to adding a "header" facet containing an outputText.
   *
   * @return  the new headerText value
   */
  final public String getHeaderText()
  {
    return ComponentUtils.resolveString(getProperty(HEADER_TEXT_KEY));
  }

  /**
   * Sets text to display in the header of the column.  This is a convenience that generates output equivalent to adding a "header" facet containing an outputText.
   * 
   * @param headerText  the new headerText value
   */
  final public void setHeaderText(String headerText)
  {
    setProperty(HEADER_TEXT_KEY, (headerText));
  }

  /**
   * Gets whether or not the column contents should be allowed to wrap
   *
   * @return  the new noWrap value
   */
  final public boolean isNoWrap()
  {
    return ComponentUtils.resolveBoolean(getProperty(NO_WRAP_KEY), false);
  }

  /**
   * Sets whether or not the column contents should be allowed to wrap
   * 
   * @param noWrap  the new noWrap value
   */
  final public void setNoWrap(boolean noWrap)
  {
    setProperty(NO_WRAP_KEY, noWrap ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether or not the column header
   * should be allowed to wrap
   *
   * @return  the new headerNoWrap value
   */
  final public boolean isHeaderNoWrap()
  {
    return ComponentUtils.resolveBoolean(getProperty(HEADER_NO_WRAP_KEY), false);
  }

  /**
   * Sets whether or not the column header
   * should be allowed to wrap
   * 
   * @param headerNoWrap  the new headerNoWrap value
   */
  final public void setHeaderNoWrap(boolean headerNoWrap)
  {
    setProperty(HEADER_NO_WRAP_KEY, headerNoWrap ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets <html>whether or not the column is sortable. A sortable column has a clickable header that (when clicked) sorts the table by that column's property. Note that in order for a column to be sortable, this attribute must be set to "true" and the underlying model must support sorting by this column's property. <p> This column's "sortProperty" attribute must be set if sorting is desired.</p></html>
   *
   * @return  the new sortable value
   */
  final public boolean isSortable()
  {
    return ComponentUtils.resolveBoolean(getProperty(SORTABLE_KEY), false);
  }

  /**
   * Sets <html>whether or not the column is sortable. A sortable column has a clickable header that (when clicked) sorts the table by that column's property. Note that in order for a column to be sortable, this attribute must be set to "true" and the underlying model must support sorting by this column's property. <p> This column's "sortProperty" attribute must be set if sorting is desired.</p></html>
   * 
   * @param sortable  the new sortable value
   */
  final public void setSortable(boolean sortable)
  {
    setProperty(SORTABLE_KEY, sortable ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether or not the children of this column should be rendered on separate rows. Setting this attribute to true will cause each child to render in its own row. Setting this to false will cause all the children to be rendered in one cell, which will rowSpan across the rows of the Columns whose children are rendered on separate rows.
   *
   * @return  the new separateRows value
   */
  final public boolean isSeparateRows()
  {
    return ComponentUtils.resolveBoolean(getProperty(SEPARATE_ROWS_KEY), false);
  }

  /**
   * Sets whether or not the children of this column should be rendered on separate rows. Setting this attribute to true will cause each child to render in its own row. Setting this to false will cause all the children to be rendered in one cell, which will rowSpan across the rows of the Columns whose children are rendered on separate rows.
   * 
   * @param separateRows  the new separateRows value
   */
  final public void setSeparateRows(boolean separateRows)
  {
    setProperty(SEPARATE_ROWS_KEY, separateRows ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets Whether or not this column is a row header column.
   *
   * @return  the new rowHeader value
   */
  final public boolean isRowHeader()
  {
    return ComponentUtils.resolveBoolean(getProperty(ROW_HEADER_KEY), false);
  }

  /**
   * Sets Whether or not this column is a row header column.
   * 
   * @param rowHeader  the new rowHeader value
   */
  final public void setRowHeader(boolean rowHeader)
  {
    setProperty(ROW_HEADER_KEY, rowHeader ? Boolean.TRUE : Boolean.FALSE);
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
   * Construct an instance of the CoreColumn.
   */
  protected CoreColumn(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Column","org.apache.myfaces.trinidad.Column");
  }
}
