package com.jwebmp.plugins.jqlayout.interfaces;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.HeaderText;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqlayout.JQLayoutContentDiv;
import com.jwebmp.plugins.jqlayout.JQLayoutDiv;
import com.jwebmp.plugins.jqlayout.JQLayoutFooterDiv;
import com.jwebmp.plugins.jqlayout.JQLayoutHeaderDiv;
import com.jwebmp.plugins.jqlayout.components.BorderLayout;
import com.jwebmp.plugins.jqlayout.enumerations.JQLayoutArea;
import com.jwebmp.plugins.jqlayout.options.JQLayoutDefaultOptions;

import jakarta.validation.constraints.NotNull;
import java.util.List;

public interface IJQLayoutDiv<J extends JQLayoutDiv<J>>
{

	/**
	 * Returns a never empty list of header
	 *
	 * @return
	 */
	@NotNull
	List<JQLayoutHeaderDiv<?>> getHeaders();

	/**
	 * Returns the footers listing
	 *
	 * @return
	 */
	@NotNull
	List<JQLayoutFooterDiv<?>> getFooters();

	/**
	 * Sets the footer collection
	 *
	 * @param footers
	 */
	@NotNull
	
	J setFooters(List<JQLayoutFooterDiv<?>> footers);

	/**
	 * Sets the headers
	 *
	 * @param headers
	 */
	
	@NotNull
	J setHeaders(List<JQLayoutHeaderDiv<?>> headers);

	/**
	 * *
	 * Adds a new header to the div and applies the Widget Header class
	 * <p>
	 *
	 * @param headerDivString
	 */
	
	@NotNull
	J addHeader(String headerDivString);

	/**
	 * Adds the Div as a header and applies the class Widget Header
	 * <p>
	 *
	 * @param headerDiv
	 */

	
	@NotNull
	J addHeader(JQLayoutHeaderDiv<?> headerDiv);

	/**
	 * Adds the footer header
	 * <p>
	 *
	 * @param footerHeaderText
	 */

	
	@NotNull
	J addFooter(HeaderText<?> footerHeaderText);

	/**
	 * Adds a Pin for this Div
	 * <p>
	 *
	 * @param component
	 *
	 * @return The original component
	 */
	
	@NotNull
	J addPin(IComponentHierarchyBase<?,?> component);

	/**
	 * Adds the open event to a component
	 * <p>
	 *
	 * @param button
	 * 		The component to add the open event to
	 */
	
	@NotNull
	J addToggleButton(IComponentHierarchyBase<?,?> button);

	/**
	 * Adds the close event to the component
	 * <p>
	 *
	 * @param button
	 * 		The button to add a close event to
	 */
	
	@NotNull
	J addCloseButton(IComponentHierarchyBase<?,?> button);

	/**
	 * Adds the footer to the component
	 * <p>
	 *
	 * @param footerDiv
	 */
	
	@NotNull
	J addFooter(JQLayoutFooterDiv<?> footerDiv);

	/**
	 * Adds the footer
	 * <p>
	 *
	 * @param footerDivString
	 */
	
	@NotNull
	J addFooter(String footerDivString);

	/**
	 * Adds the header to the layout div
	 * <p>
	 *
	 * @param headerDivString
	 */

	
	@NotNull
	J addHeader(HeaderText<?> headerDivString);

	/**
	 * Adds the open event to a component
	 * <p>
	 *
	 * @param button
	 * 		The component to add the open event to
	 */
	
	@NotNull
	J addOpenButton(IComponentHierarchyBase<?,?> button);

	/**
	 * Removes the footer
	 * <p>
	 *
	 * @param footerDiv
	 */

	
	@NotNull
	J removeFooter(JQLayoutFooterDiv<?> footerDiv);

	/**
	 * Removes the header
	 * <p>
	 *
	 * @param headerDiv
	 */
	
	@NotNull
	J removeHeader(JQLayoutHeaderDiv<?> headerDiv);

	/**
	 * Gets the current assigned area
	 * <p>
	 *
	 * @return
	 */
	@NotNull
	JQLayoutArea getArea();

	/**
	 * Returns the current content div
	 * <p>
	 *
	 * @return
	 */
	@NotNull JQLayoutContentDiv<?> getContentDiv();

	/**
	 * Returns the layout attached to this layout div
	 * <p>
	 *
	 * @return
	 */
	@NotNull
	BorderLayout<?> getLayout();

	/**
	 * Sets the layout for this div
	 * <p>
	 *
	 * @param layout
	 */
	
	@NotNull
	J setLayout(@NotNull BorderLayout<?> layout);

	/**
	 * Sets the content div of this layout
	 *
	 * @param contentDiv
	 */
	
	@NotNull
	J setContentDiv(JQLayoutContentDiv<?> contentDiv);

	/**
	 * Sets the current assigned area
	 * <p>
	 *
	 * @param area
	 */
	
	@NotNull
	J setArea(JQLayoutArea area);

	@NotNull
	JQLayoutDefaultOptions<?> getOptions();
}
