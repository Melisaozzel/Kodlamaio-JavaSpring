package kodlama.io.rentACar.coreCommon.utilities.mappers;

import org.modelmapper.ModelMapper;

public  interface  ModelMapperService {

	ModelMapper forResponse();
	ModelMapper forRequest();
}
