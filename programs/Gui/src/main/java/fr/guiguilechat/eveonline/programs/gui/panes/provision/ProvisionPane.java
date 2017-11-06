package fr.guiguilechat.eveonline.programs.gui.panes.provision;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.guiguilechat.eveonline.programs.gui.Manager;
import fr.guiguilechat.eveonline.programs.gui.panes.EvePane;
import fr.guiguilechat.eveonline.programs.gui.panes.SelectTeamPane;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;

public class ProvisionPane extends BorderPane implements EvePane {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(ProvisionPane.class);

	protected Manager parent;

	@Override
	public Manager parent() {
		return parent;
	}

	protected Accordion accordion;

	protected ProvisionLPStorePane lpstore;
	protected ProvisionRegistered registered;
	protected ProvisionBlueprint blueprint;
	TitledPane otp, ltp, btp;

	protected SelectTeamPane selectTeam;

	protected EvePane[] children;

	@Override
	public EvePane[] subEvePanes() {
		return children;
	}

	public ProvisionPane(Manager parent) {
		this.parent = parent;
		selectTeam = new SelectTeamPane(parent);
		setTop(selectTeam);

		lpstore = new ProvisionLPStorePane(parent);
		registered = new ProvisionRegistered(parent);
		blueprint = new ProvisionBlueprint(parent);
		otp = new TitledPane("registered", registered);
		ltp = new TitledPane("lpstore", lpstore);
		btp = new TitledPane("blueprint", blueprint);
		accordion = new Accordion(otp, ltp, btp);
		accordion.setExpandedPane(otp);
		accordion.expandedPaneProperty().addListener((ov, old, now) -> {
			if (old != null) {
				TP2Pane(old).propagateIsShown(false);
			}
			if (now != null) {
				TP2Pane(now).propagateIsShown(true);
			}
		});
		setCenter(accordion);
		children = new EvePane[] { selectTeam, lpstore, registered, blueprint };
	}

	protected EvePane TP2Pane(TitledPane tp) {
		return tp == null ? null : (EvePane) tp.getContent();
	}

	@Override
	public boolean isShownSubPane(EvePane child) {
		return child == TP2Pane(accordion.getExpandedPane());
	}

}