package br.com.gabiroba.abstractfactory.apple.factory.abstractFactory;

import br.com.gabiroba.abstractfactory.apple.model.certificate.Certificate;
import br.com.gabiroba.abstractfactory.apple.model.certificate.USCertificate;
import br.com.gabiroba.abstractfactory.apple.model.packing.Packing;
import br.com.gabiroba.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
