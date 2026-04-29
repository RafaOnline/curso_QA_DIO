package one.digitalinnovation.beerstock.mapper;

import javax.annotation.processing.Generated;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.dto.BeerDTO.BeerDTOBuilder;
import one.digitalinnovation.beerstock.entity.Beer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-29T00:02:41-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        beer.setBrand( beerDTO.getBrand() );
        beer.setId( beerDTO.getId() );
        if ( beerDTO.getMax() != null ) {
            beer.setMax( beerDTO.getMax() );
        }
        beer.setName( beerDTO.getName() );
        if ( beerDTO.getQuantity() != null ) {
            beer.setQuantity( beerDTO.getQuantity() );
        }
        beer.setType( beerDTO.getType() );

        return beer;
    }

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTOBuilder beerDTO = BeerDTO.builder();

        beerDTO.brand( beer.getBrand() );
        beerDTO.id( beer.getId() );
        beerDTO.max( beer.getMax() );
        beerDTO.name( beer.getName() );
        beerDTO.quantity( beer.getQuantity() );
        beerDTO.type( beer.getType() );

        return beerDTO.build();
    }
}
