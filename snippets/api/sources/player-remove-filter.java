ServerPlayerSource source = /* */;

source.getFilters()
        .stream()
        .findFirst()
        .ifPresent(source::removeFilter);
