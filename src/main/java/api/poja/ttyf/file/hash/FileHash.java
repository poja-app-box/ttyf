package api.poja.ttyf.file.hash;

import api.poja.ttyf.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
