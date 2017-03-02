package com.parasol.core.Enum;

public enum TenderStatusEnum {
	
	   ORDER_PROGRAMME_SURVEY(0, "工程类" , "勘察"),
	   ORDER_PROGRAMME_CONSTRUCTION(1, "工程类" , "施工"),
	   ORDER_PROGRAMME_MAJOR(2, "工程类" , "专业"), 
	   ORDER_PROGRAMME_AUDIT(3, "工程类" , " 审计 "),
	   ORDER_PROGRAMME_SUPERVISOR(4, "工程类" , "监理"),
	   ORDER_PROGRAMME_OTHER(5, "工程类" , "其他"),
	   ORDER_PURCHASE_EQUIPMENT(6, "采购类" , "机械设备"),
	   ORDER_PURCHASE_MATERIAL(7, "采购类" , "原材料"), 
	   ORDER_PURCHASE_PARTS(8, "采购类" , "零部件"),
	   ORDER_PURCHASE_TECHNOLOGY(9, "采购类" , "技术"),
	   ORDER_PURCHASE_SERVICE(10, "采购类" , "服务"),
	   ORDER_PURCHASE_MRO(11, "采购类" , "MRO(维修与作业)"),
	   ORDER_PURCHASE_OTHER(12,"采购类","其他"),
	   ORDER_DESIGN_INDUSTRY(13,"设计类","工业"),
	   ORDER_DESIGN_BUILD(14,"设计类","建筑"),
	   ORDER_DESIGN_INDOOR(15,"设计类","室内"),
	   ORDER_DESIGN_SCENERY(16,"设计类","景观"),
	   ORDER_DESIGN_OTHER(17,"设计类","其他"),
	   ORDER_PROPERTY_MANAGE(18,"物业管理类","物业管理"),
	   ORDER_PROPERTY_SERVICE(19,"物业管理类","物业服务"),
	   ORDER_PROPERTY_OTHER(20,"物业管理类","其他"),
	   ORDER_COST_CONSULTATION(21,"造价咨询类","工程造价咨询");
	   
		
			private Integer code;
			private String esc;
			private String desc;
			
	    TenderStatusEnum(Integer code, String esc , String desc) {
	        this.code = code;
	        this.esc = esc;
	        this.desc = desc;
	    }

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getEsc() {
			return esc;
		}

		public void setEsc(String esc) {
			this.esc = esc;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	    
	    public static TenderStatusEnum getByCode(Integer code){
	        if(code == null){
	            return null;
	        }
	        for(TenderStatusEnum pt: TenderStatusEnum.values()){
	            if (pt.getCode().intValue() == code.intValue()) {
	                return pt;
	            }
	        }
	        return null;
	    } 
}
