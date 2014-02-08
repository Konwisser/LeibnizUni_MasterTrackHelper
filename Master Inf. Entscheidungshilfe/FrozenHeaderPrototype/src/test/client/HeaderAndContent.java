package test.client;


import org.gwt.advanced.client.ui.widget.AdvancedFlexTable;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ScrollPanel;


public class HeaderAndContent extends ResizeComposite {

	public HeaderAndContent() {

		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.EM);
		initWidget(dockLayoutPanel);
		dockLayoutPanel.setSize("100%", "100%");

		Label lblFooter = new Label("Footer");
		dockLayoutPanel.addSouth(lblFooter, 1.5);

		FlexTable header = new FlexTable();
		dockLayoutPanel.addNorth(header, 1.5);

		ScrollPanel scrollPanel = new ScrollPanel();
		dockLayoutPanel.add(scrollPanel);

		FlexTable body = new FlexTable();
		scrollPanel.setWidget(body);
		
		header.setStyleName("table");
		header.addStyleName("tableHeader");
		body.setStyleName("table");

		header.setWidth("100%");
		body.setWidth("100%");
		
		header.setWidget(0, 0, new Label("HEADER A"));
		header.setWidget(0, 1, new Label("HEADER B"));
		header.setWidget(0, 2, new Label("HEADER C"));

		for (int i = 0; i < 100; i++) {
			body.setText(i, 0, "A" + i);
			body.setText(i, 1, "B" + i);
			body.setText(i, 2, "C" + i);
		}

		
		
//		header.getWidget(0, 0).addHandler(new ResizeHandler() {
//			
//			@Override
//			public void onResize(ResizeEvent event) {
//			
//				System.out.println("new width of cell (0,0): " + event.getWidth());
//			}
//		}, ResizeEvent.getType());

		
//		for (int col = 0; col < header.getCellCount(0); col++) {
//			String width = header.getCellFormatter().getElement(0, col)
//					.getAttribute("offsetWidth");
//			body.getColumnFormatter().setWidth(col, width);
//		}
	}

}
