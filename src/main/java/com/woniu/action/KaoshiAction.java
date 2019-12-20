package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Kaoshi;
import com.woniu.service.IKaoshiService;

@Controller
public class KaoshiAction {
  
	@Autowired
    private IKaoshiService ks;
	private Kaoshi ka;
	private List<Kaoshi> kas;
	public Kaoshi getKa() {
		return ka;
	}
	public void setKa(Kaoshi ka) {
		this.ka = ka;
	}
	public List<Kaoshi> getKas() {
		return kas;
	}
	public void setKas(List<Kaoshi> kas) {
		this.kas = kas;
	}
	public IKaoshiService getKs() {
		return ks;
	}
	public void setKs(IKaoshiService ks) {
		this.ks = ks;
	}
	
	public String kaList() {
		kas = ks.findAll();
		//System.out.println(kas);
		return "kaList";
	}
}
